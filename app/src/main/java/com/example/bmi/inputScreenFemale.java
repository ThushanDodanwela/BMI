package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class inputScreenFemale extends AppCompatActivity {
    private EditText age, height, weight;
    private Button next, previous;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_input_screen_female);

        age = (EditText) findViewById(R.id.inputAge);
        height = (EditText) findViewById(R.id.inputHeight);
        weight = (EditText) findViewById(R.id.inputWeight);
        next = (Button) findViewById(R.id.button);
        previous = (Button) findViewById(R.id.button3);



    }
}