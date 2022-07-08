package com.example.attempt2birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Option2 extends AppCompatActivity {
TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);

        message =findViewById(R.id.wish2);

        Intent iGet = getIntent();
//        int number = Integer.parseInt(iGet.getStringExtra("Age"));
//        int finalAge = (365*number)+(number/4);

        message.setText(iGet.getStringExtra("Name"));
//        int number = Integer.parseInt(iGet.getStringExtra("Age"));
//        int finalAge = (365*number)+(number/4);
//        message.setText("Happiest Birthday "+finalAge+" Days Old Dude!!\n"+"I am Glad to have you in my life "+iGet.getStringExtra("Name")+"\nHope this year brings prosperity i your life. Stay beautiful as you are !!!");
    }
}