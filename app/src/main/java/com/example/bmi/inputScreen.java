package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.util.Log.println;
import static java.lang.Double.*;

public class inputScreen extends AppCompatActivity {


      EditText age, height, weight;
      Button next,previous;
      Float bmi,heightValue, weightValue;
      TextView rs;
      String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_input_screen);

        age = (EditText) findViewById(R.id.inputAge);
        height = (EditText) findViewById(R.id.inputHeight);
        weight = (EditText) findViewById(R.id.inputWeight);
        next = (Button) findViewById(R.id.button);
        previous = (Button) findViewById(R.id.button3);


        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s1 = height.getText().toString();
                String s2 = weight.getText().toString();

                float heightValue = Float.parseFloat(s1) / 100;
                float weightValue = Float.parseFloat(s2);

                float bmi = weightValue / (heightValue * heightValue);
                String rs = String.valueOf(bmi);
                if(bmi<18.5){
                    String st = "You are Under Weight" ;

                }
                else if (bmi <24.9){
                    String st = "Your BMI is Normal";
                }
                else {
                    String st = "You are Over Weight";
                }

                Intent intent = new Intent(inputScreen.this, ResultBMI.class);
                intent.putExtra("Result", rs);
                intent.putExtra("caption", st);
                startActivity(intent);

            }
        });


    }














}