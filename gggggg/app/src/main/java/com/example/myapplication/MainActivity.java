package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button log_to_service;
    private TextView text;
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.editTextText);
        password= findViewById(R.id.editTextNumberPassword);
        log_to_service = findViewById(R.id.button);
        text = findViewById(R.id.hello);

        log_to_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if login==
//                if password==
            }
        });

    }
}