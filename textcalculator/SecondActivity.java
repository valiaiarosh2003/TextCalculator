package com.example.textcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int num1 = getIntent().getExtras().getInt("num1");
        int num2 = getIntent().getExtras().getInt("num2");
        int num12 = getIntent().getExtras().getInt("num12");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView res = (TextView)findViewById(R.id.second);

        String result;
        String strNumber1 = Integer.toString(num1);
        String strNumber2 = Integer.toString(num2);
        String strNumber12 = Integer.toString(num12);

        if (num2 < 0){
            strNumber2 = "(" + Integer.toString(num2) + ")";
        }

        result = strNumber1 + " + " + strNumber2 + " = " + strNumber12;
        res.setText(result);
    }
}