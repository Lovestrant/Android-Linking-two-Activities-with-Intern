package com.example.linkingtwoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String AGE = "AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //get Elements by Id
        TextView detailDisplay = findViewById(R.id.displayDetails);
        TextView ageDisplay = findViewById(R.id.ageDisplay);
        Button back = findViewById(R.id.goBack);

        //getting the intent
        Intent i = getIntent();

        String name = i.getStringExtra(NAME);
        String age = i.getStringExtra(AGE);

        detailDisplay.setText("Your name is"+name);
        ageDisplay.setText("your age is"+age);

      back.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //Go back to previous Activity

              Intent returnBack = new Intent(secondActivity.this, MainActivity.class);
              startActivity(returnBack);
          }
      });



    }
}