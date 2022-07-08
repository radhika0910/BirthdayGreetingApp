package com.example.attempt2birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {
//  TextView etName, etAge;
String name , age;
    TextView messageAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

//        etName=findViewById(R.id.Option1);
//        etAge=findViewById(R.id.Option2);

        Intent iGet = getIntent();

//        etName.setText(iGet.getStringExtra("Name"));
//        etAge.setText(iGet.getStringExtra("Age"));
        name = iGet.getStringExtra("Name");
        age = iGet.getStringExtra("Age");
//        int number = Integer.parseInt(iGet.getStringExtra("Age"));
//        int finalAge = (365*number)+(number/4);
      //  messageAge = findViewById(R.id.textView4);
       // messageAge.setText(name+ " is "+finalAge+" days Old .");
        Button opt1 = (Button) findViewById(R.id.generate1);
        Button opt2 = (Button) findViewById(R.id.generate2);
       // Button opt3 = (Button) findViewById(R.id.generate3);
       // Button opt4 = (Button) findViewById(R.id.generate4);
        //Button opt5 = (Button) findViewById(R.id.generate5);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Display.this,"Option 1 clicked",Toast.LENGTH_SHORT).show();
               Intent wish1 = new Intent(Display.this,Option1.class);
                wish1.putExtra("Name",name);
               // wish1.putExtra("Age",age);
                startActivity(wish1);

            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Display.this,"Almost there !!!",Toast.LENGTH_SHORT).show();
                Intent wish = new Intent(Display.this,Option2.class);
                wish.putExtra("Name",name);
              //  wish.putExtra("Age",age);
                startActivity(wish);
            }
        });

//        opt3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Display.this,"Almost there !!!",Toast.LENGTH_SHORT).show();
//                Intent wish3 = new Intent(Display.this,Option3.class);
//                wish3.putExtra("Name",name);
//                wish3.putExtra("Age",age);
//                startActivity(wish3);
//            }
//        });

//        opt4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Display.this,"Aaaha!!! Great choice",Toast.LENGTH_SHORT).show();
//                Intent wish1 = new Intent(Display.this,Option1.class);
//                wish1.putExtra("Name",name);
//                wish1.putExtra("Age",age);
//                startActivity(wish1);
//            }
//        });
//
//        opt5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Display.this,"They would love it !!!",Toast.LENGTH_SHORT).show();
//                Intent wish1 = new Intent(Display.this,Option1.class);
//                wish1.putExtra("Name",name);
//                wish1.putExtra("Age",age);
//                startActivity(wish1);
//            }
//        });


    }
}