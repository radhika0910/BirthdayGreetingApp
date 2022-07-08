package com.example.attempt2birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
//    public static final String EXTRA_MESSAGE = "com.example.attempt2birthdayGreeting.MESSAGE";
//    public static final String EXTREMENESS = "com.example.attempt2birthdayGreeting.MESSAGE";
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        etName = findViewById(R.id.name);
       // etAge = findViewById(R.id.age);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity4();
            }
        });
    }

    public void openInsideActivity4() {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("Name",etName.getText().toString());
       // intent.putExtra("Age",etAge.getText().toString());
       // EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        etName.setText("");
       // etAge.setText("");
        startActivity(intent);




    }


}