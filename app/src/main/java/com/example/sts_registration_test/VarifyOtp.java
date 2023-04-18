package com.example.sts_registration_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class OtpSend extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_send);

        editText = findViewById(R.id.editText);


        Intent i = getIntent();
        String name = i.getStringExtra("email");

        editText.setText(name);
    }
}