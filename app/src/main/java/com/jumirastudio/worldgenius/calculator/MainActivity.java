package com.jumirastudio.worldgenius.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstEditText;
    EditText SecondEditText;
    Button btnAddition;
    Button btnMultyplay;
    Button btnMinuss;
    Button btnDivesion;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEditText = findViewById(R.id.editTextOne);
        btnAddition = findViewById(R.id.btnAdd);
        btnMinuss = findViewById(R.id.btnMinus);
        btnDivesion = findViewById(R.id.btnDiv);
        btnMultyplay = findViewById(R.id.btnMult);
        SecondEditText = findViewById(R.id.editTextTwo);
        tvResult = findViewById(R.id.result);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(firstEditText.getText().toString());
                int number2 = Integer.parseInt(SecondEditText.getText().toString());
                int res = number1 + number2;
                tvResult.setText("Result Is"+ res);
            }
        });

        btnMinuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(firstEditText.getText().toString());
                int number2 = Integer.parseInt(SecondEditText.getText().toString());
                int res = number1 - number2;
                tvResult.setText("Result Is"+ res);
            }
        });

        btnMultyplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(firstEditText.getText().toString());
                int number2 = Integer.parseInt(SecondEditText.getText().toString());
                int res = number1 * number2;
                tvResult.setText("Result Is"+ res);
            }
        });

        btnDivesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(firstEditText.getText().toString());
                int number2 = Integer.parseInt(SecondEditText.getText().toString());
                int res = number1 / number2;
                tvResult.setText("Result Is"+ res);
            }
        });

    }
}