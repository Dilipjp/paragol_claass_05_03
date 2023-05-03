package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Activity1 extends AppCompatActivity {
    Button btn_back;
    CheckBox ch1, ch2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

//        ch1 = findViewById(R.id.checkBox_male);
//        ch2 = findViewById(R.id.checkBox_female);
//        btn_back = findViewById(R.id.back_btn);
//
//        btn_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }
}