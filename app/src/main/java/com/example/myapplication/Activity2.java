package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button order_btn;
    CheckBox pizza,coffee,icecream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        order_btn = findViewById(R.id.order_btn);

        pizza = findViewById(R.id.pizza);
        coffee = findViewById(R.id.coffee);
        icecream = findViewById(R.id.icecream);
        order_btn = findViewById(R.id.order_btn);

        order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("Order include:");

                if(pizza.isChecked()){
                    result.append("\nPizza get selected");
                }
                if(coffee.isChecked()){
                    result.append("\nCoffee get selected");
                }
                if(icecream.isChecked()){
                    result.append("\nIceCream get selected");
                }
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG ).show();
            }
        });
    }
}