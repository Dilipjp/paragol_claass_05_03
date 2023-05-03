package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    Button click_me;
    CheckBox male, female;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        click_me = findViewById(R.id.click_me);
        male = findViewById(R.id.checkBox_male);
        female = findViewById(R.id.checkBox_female);

        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("Order include:");

                if(male.isChecked()){
                    result.append("\n Male selected");
                }
                if(female.isChecked()){
                    result.append("\n Female get selected");
                }
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG ).show();
            }
        });
    }
}