package com.example.linkingtwoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    //Get the button by Id
    Button button1 = findViewById(R.id.SubmitBtn);
    //get the text views
    TextView age = findViewById(R.id.Age);
    TextView name = findViewById(R.id.Name);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set an onclick listener to the button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();

            }
        });


    }
    //function to handle data submit
    public void sendData() {
        //Get the values of textViews
        int TheAge = Integer.parseInt(age.getText().toString());
        String TheName = name.getText().toString();

        //create a new intent
        Intent i = new Intent(MainActivity.this, secondActivity.class);

        //pass values from main activity to the second activity

        i.putExtra(secondActivity.NAME, TheName);
        i.putExtra(secondActivity.AGE, TheAge);
        //Now start Activity and pass the data
        startActivity(i);
    }
}
