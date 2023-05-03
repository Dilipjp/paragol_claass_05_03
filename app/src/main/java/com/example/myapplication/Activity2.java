package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button order_btn;
    CheckBox p_ch,c_ch,i_ch;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        order_btn = findViewById(R.id.order_btn);

        p_ch = findViewById(R.id.pizza);
        c_ch = findViewById(R.id.coffee);
        i_ch = findViewById(R.id.icecream);
        order_btn = findViewById(R.id.order_btn);

        order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                StringBuilder result = new StringBuilder();
//                result.append("Order include:");
//
//                if(p_ch.isChecked()){
//                    result.append("\nPizza get selected");
//                }
//                if(c_ch.isChecked()){
//                    result.append("\nCoffee get selected");
//                }
//                if(i_ch.isChecked()){
//                    result.append("\nIceCream get selected");
//                }
                Toast.makeText(getApplicationContext(),"test", Toast.LENGTH_LONG ).show();
            }
        });
    }
}