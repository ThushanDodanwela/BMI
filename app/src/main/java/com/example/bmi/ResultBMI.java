package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class ResultBMI extends AppCompatActivity {
    TextView output, rsstatus;
    String s, line;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result_b_m_i);

       output = (TextView) findViewById(R.id.result);
       rsstatus = (TextView) findViewById(R.id.status);

        Intent i = getIntent();
        s = i.getStringExtra("Result");
        line = i.getStringExtra("caption");

        output.setText(s);
        rsstatus.setText(line);


       }


    }
