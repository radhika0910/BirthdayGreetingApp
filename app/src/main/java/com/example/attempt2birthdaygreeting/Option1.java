package com.example.attempt2birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Option1 extends AppCompatActivity {
TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);

        message =findViewById(R.id.wish1);

        Intent iGet = getIntent();
        message.setText(" Wishing you a fantastic birthday "+iGet.getStringExtra("Name")+" and a journey of another wonderful 364 days of which today is the first day my dear.");

    }


}