package com.example.fourthguidedexercise;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    TextView result;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsernameGE4);
        password = findViewById(R.id.etPasswordGE4);
        result = findViewById(R.id.tvResultGE4);
        login = findViewById(R.id.btnLoginGE4);

        showResult();
    }

    @SuppressLint("SetTextI18n")
    public void showResult() {
        login.setOnClickListener(view -> {
            String userInput = username.getText().toString();
            String passInput = password.getText().toString();

            if (userInput.equals("papsi") && passInput.equals("android")) {
                result.setText("WELCOME " + userInput.toUpperCase() + "!");
                result.setTextColor(Color.GREEN);
            } else {
                result.setText("USERNAME AND PASSWORD DOES NOT EXIST!");
                result.setTextColor(Color.RED);
            }

            result.setVisibility(View.VISIBLE);
            clearEntry();
        });
    }

    public void clearEntry() {
        username.setText("");
        password.setText("");
        username.requestFocus();
    }
}
