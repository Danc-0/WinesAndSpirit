package com.example.databindingdrinks.WelcomeAndAuth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.databindingdrinks.R;

public class Main2Activity extends AppCompatActivity {

    Button btnSignIn,btnSignUp;
    TextView slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);

        slogan = (TextView)findViewById(R.id.slogan);

        Typeface face = Typeface.createFromAsset(getAssets(),"Fonts/NABILA.TTF");
        slogan.setTypeface(face);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,SignIn.class);
                startActivity(i);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(Main2Activity.this, SignUp.class);
                startActivity(SignUp);
            }
        });
    }
}
