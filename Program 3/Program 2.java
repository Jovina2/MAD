package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        EditText u = findViewById(R.id.editTextText);
        EditText p = findViewById(R.id.editTextTextPassword);
        EditText a = findViewById(R.id.editTextText2);
        EditText g = findViewById(R.id.editTextText3);
        EditText c = findViewById(R.id.editTextText4);
        TextView tx = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = u.getText().toString();
                String password = p.getText().toString();
                String address = a.getText().toString();
                String gender = g.getText().toString();
                String age = c.getText().toString();

                String message = "Username: " + username + "\n" +
                        "Password: " + password + "\n" +
                        "Address: " + address + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age;

                tx.setText(message);
            }
        });
    }
}
