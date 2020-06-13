package com.example.databindingdrinks.Mpesa;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.androidstudy.daraja.Daraja;
import com.androidstudy.daraja.DarajaListener;
import com.androidstudy.daraja.model.AccessToken;
import com.androidstudy.daraja.model.LNMExpress;
import com.androidstudy.daraja.model.LNMResult;
import com.androidstudy.daraja.util.TransactionType;
import com.example.databindingdrinks.R;
import com.example.databindingdrinks.models.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.URL;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MpesaFragment extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.number)
    EditText mNumber;
//    @BindView(R.id.amount)
//    EditText mAmount;
    @BindView(R.id.button)
    Button mButton;
    @BindView(R.id.progressBar)
    ProgressBar mLoad;
    private Daraja daraja;
    private Spinner UserLocation;
    EditText mAmount;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mDatabaseReference;
    ChildEventListener mChildEventListener;
    final String uniqueID = UUID.randomUUID().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mpesa);

        ReceiveAmountData();

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference().child("Users").child(uniqueID);
        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                User td = dataSnapshot.getValue(User.class);
                FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
                if (firebaseUser != null) {
                    mNumber.setText(td.getPhoneNumber());
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mDatabaseReference.addChildEventListener(mChildEventListener);

        UserLocation = findViewById(R.id.yourLocation);
        UserLocation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MpesaFragment.this, "Please choose your nearest pick up point", Toast.LENGTH_SHORT).show();
            }
        });

        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
        daraja = Daraja.with("UI6KcmK6xzknpApQGgJBqbZ9jp6uMhxi", "rSMmUhBHb8A0ogWP", new DarajaListener<AccessToken>() {
            @Override
            public void onResult(AccessToken accessToken) {
                Log.i(MpesaFragment.this.getClass().getSimpleName(), accessToken.getAccess_token());
            }

            @Override
            public void onError(String error) {
                Log.e(MpesaFragment.this.getClass().getSimpleName(), error);

            }
        });
    }

    private void ReceiveAmountData() {
        Intent GottenAmount = getIntent();
        String totalAmount = GottenAmount.getStringExtra("Amount");
        mAmount = findViewById(R.id.amount);
        mAmount.setText(totalAmount);
    }

    @Override
    public void onClick(View v) {
        if (v == mButton) {
            String phonenumber = mNumber.getText().toString().trim(); //collect the number from the user's input
            String Amount = mAmount.getText().toString().trim(); // amount provided by the user

            //check validity of a number
            if (phonenumber.isEmpty() || phonenumber.length() != 10) {
                mNumber.setError("Invalid number");
                return;
            }
            //check validity of a number
            else if (Integer.valueOf(Amount) <= 0) {
                mAmount.setError("Amount should be more than 0");
                return;
            }
            mLoad.setVisibility(View.INVISIBLE );
            LNMExpress lnmExpress = new LNMExpress(
                    "174379",
                    "bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919",  //https://developer.safaricom.co.ke/test_credentials
                    TransactionType.CustomerPayBillOnline,
                    Amount,
                    "0710485458",
                    "174379",
                    phonenumber,
                    "http://mycallbackurl.com/checkout.php",
                    "WINE AND DINE DELIVERIES",
                    "Pay for drinks to be delivered"
            );
            daraja.requestMPESAExpress(lnmExpress,
                    new DarajaListener<LNMResult>() {
                        @Override
                        public void onResult(@NonNull LNMResult lnmResult) {
//                            mLoad.setVisibility(View.VISIBLE );
                            Log.i(MpesaFragment.this.getClass().getSimpleName(), lnmResult.ResponseDescription);
                        }

                        @Override
                        public void onError(String error) {
                            Log.i(MpesaFragment.this.getClass().getSimpleName(), error);
                        }
                    }
            );
        }

    }
}

