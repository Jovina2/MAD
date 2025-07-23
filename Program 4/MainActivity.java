package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    TextView textResult;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        textResult=findViewById(R.id.textResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(view -> calculate('+'));
        btnSubtract.setOnClickListener(view -> calculate('-'));
        btnMultiply.setOnClickListener(view -> calculate('*'));
        btnDivide.setOnClickListener(view -> calculate('/'));
    }

    private void calculate(char operator) {
        String val1 = input1.getText().toString();
        String val2 = input2.getText().toString();

        if (val1.isEmpty() || val2.isEmpty()) {
            textResult.setText("Enter both numbers");
            return;
        }

        double num1, num2;
        try {
            num1 = Double.parseDouble(val1);
            num2 = Double.parseDouble(val2);
        } catch (NumberFormatException e) {
            textResult.setText("Invalid input");
            return;
        }

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    textResult.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                textResult.setText("Unknown operation");
                return;
        }

        textResult.setText("Result: " + result);
    }
}
