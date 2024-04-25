package com.example.alkewalletmodulo4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LoginSignupPageActivity extends AppCompatActivity {

    Button btnCrear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup_page);

        btnCrear = findViewById(R.id.btnCrearCuenta);

        btnCrear.setOnClickListener(v ->{
            Intent intent = new Intent(LoginSignupPageActivity.this,SignaupPageActivity.class);
            startActivity(intent);
        });

    }
}