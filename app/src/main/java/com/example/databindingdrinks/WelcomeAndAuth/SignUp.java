package com.example.databindingdrinks.WelcomeAndAuth;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.databindingdrinks.MainActivity;
import com.example.databindingdrinks.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class SignUp extends AppCompatActivity {
    private static final String TAG = "SignUp";

    final String uniqueID = UUID.randomUUID().toString();

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    private StorageReference mStorageReference;
    private FirebaseStorage mFirebaseStorage;
    private String currentUserID;

    private ProgressBar mProgressBar;

    EditText edtEmail, edtName, phoneNumber, edtPassword, edtConfirmPassword;
    Button btnSignUp;
    TextView edtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setupFirebaseAuth();
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference().child("Users");


        mProgressBar = findViewById(R.id.mProgressBar);
        edtEmail = findViewById(R.id.edtEmail);
        edtName = findViewById(R.id.Name);
        phoneNumber = findViewById(R.id.edtPhone);

        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        edtSignUp = findViewById(R.id.edtSignUp);


        edtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: attempting to register.");

                //check for null valued EditText fields
                if (!isEmpty(edtEmail.getText().toString())
                        && !isEmpty(edtPassword.getText().toString())
                        && !isEmpty(edtConfirmPassword.getText().toString())) {

                    mProgressBar.setVisibility(View.INVISIBLE);

                    //check if passwords match
                    if (doStringsMatch(edtPassword.getText().toString(), edtConfirmPassword.getText().toString())) {
                        //Initiate registration task
                        registerNewEmail(edtEmail.getText().toString(), edtPassword.getText().toString());
                        mProgressBar.setVisibility(View.INVISIBLE);

                    } else {
                        Toast.makeText(SignUp.this, "Passwords do not Match", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(SignUp.this, "You must fill out all the fields", Toast.LENGTH_SHORT).show();
                }
                saveUserProfile();
                clear();
            }
        });

        hideSoftKeyboard();

    }

    public void registerNewEmail(final String email, String password) {

        showDialog();

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());

                        if (task.isSuccessful()) {
                            FirebaseAuth.getInstance().signOut();
                            // Log.d(TAG, "onComplete: AuthState: " + FirebaseAuth.getInstance().getCurrentUser().getUid());

                            //redirect the user to the login screen
                            redirectLoginScreen();
                        } else {
                            Toast.makeText(SignUp.this, "Unable to Register",
                                    Toast.LENGTH_SHORT).show();
                        }
                        hideDialog();

                        // ...
                    }
                });
    }

    private void saveUserProfile() {
        showDialog();
        String FirstName = edtName.getText().toString();
        String EmailAddress = edtEmail.getText().toString();
        String phone = phoneNumber.getText().toString();

        if (TextUtils.isEmpty(FirstName) || TextUtils.isEmpty(EmailAddress) || TextUtils.isEmpty(phone)) {
            Toast.makeText(this, "Please Fill All Fields", Toast.LENGTH_SHORT).show();
        } else {
            HashMap ProfileDetails = new HashMap();
            ProfileDetails.put("FirstName", FirstName);
            ProfileDetails.put("EmailAddress", EmailAddress);
            ProfileDetails.put("DOB", phone);

            mDatabaseReference.child(uniqueID).updateChildren(ProfileDetails).addOnCompleteListener(new OnCompleteListener() {
                @Override
                public void onComplete(@NonNull Task task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(SignUp.this, "Profile Saved", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(SignUp.this, "Check Your Network", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void clear() {
        edtName.setText("");
        edtEmail.setText("");
        phoneNumber.setText("");
        edtPassword.setText("");
        edtConfirmPassword.setText("");

    }

    /**
     * Redirects the user to the login screen
     */
    private void redirectLoginScreen() {
        Log.d(TAG, "redirectLoginScreen: redirecting to login screen.");

        Intent intent = new Intent(SignUp.this, SignIn.class);
        startActivity(intent);
        finish();
    }

    /**
     * Return true if @param 's1' matches @param 's2'
     *
     * @param s1
     * @param s2
     * @return
     */
    private boolean doStringsMatch(String s1, String s2) {
        return s1.equals(s2);
    }

    /**
     * Return true if the @param is null
     *
     * @param string
     * @return
     */
    private boolean isEmpty(String string) {
        return string.equals("");
    }


    private void showDialog() {
        mProgressBar.setVisibility(View.VISIBLE);

    }

    private void hideDialog() {
        if (mProgressBar.getVisibility() == View.VISIBLE) {
            mProgressBar.setVisibility(View.INVISIBLE);
        }
    }

    private void hideSoftKeyboard() {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    private void setupFirebaseAuth() {
        Log.d(TAG, "setupFirebaseAuth: started.");

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {

                    Intent intent = new Intent(SignUp.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(SignUp.this, "Check your credentials", Toast.LENGTH_SHORT).show();

                }

            }
        };
    }


    @Override
    public void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            FirebaseAuth.getInstance().removeAuthStateListener(mAuthListener);
        }
    }
}



