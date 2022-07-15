package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {


        private Switch adjust;
        private Button next;
        private TextView female;
        private TextView male;
        private ImageView femaleImage;
        private ImageView maleImage;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_dashboard);

            adjust = (Switch) findViewById(R.id.switch2);
            maleImage = (ImageView) findViewById(R.id.imageView7);
            male = (TextView) findViewById(R.id.textView4);
            femaleImage = (ImageView) findViewById(R.id.imageView3);
            female = (TextView) findViewById(R.id.textView3);
            next = (Button) findViewById(R.id.button3);


            adjust.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == true) {
                        maleImage.setAlpha((float) 1.0);
                        male.setEnabled(true);
                        female.setEnabled(false);
                        femaleImage.setAlpha((float) 0.4);

                    } else {

                        maleImage.setAlpha((float) 0.4);
                        male.setEnabled(false);
                        female.setEnabled(true);
                        femaleImage.setAlpha((float) 1.0);
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (adjust.isChecked()) {
                        Intent intent = new Intent(dashboard.this, inputScreen.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent(dashboard.this,inputScreenFemale.class);
                        startActivity(intent);
                        finish();


                    }


                }
            });

        }
    }



