package com.example.textcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        EditText numberOne = findViewById(R.id.editTextNumberOne);
        EditText numberTwo = findViewById(R.id.editTextNumberTwo);

        String num1 = numberOne.getText().toString();
        String num2 = numberTwo.getText().toString();

        if (num1.equals("")){
            num1 = "0"; }
        if (num2.equals("")){
            num2 = "0"; }

        int Number1 = Integer.parseInt(num1);
        int Number2 = Integer.parseInt(num2);

        int num12 = Number1 + Number2;

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("num1", Number1);
        intent.putExtra("num2", Number2);
        intent.putExtra("num12", num12);

        startActivity(intent);

    }
}