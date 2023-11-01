package com.diegoemmanuelmartinezcortes.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SegundaVistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundavista);

        Button btBack = findViewById(R.id.buttonBack);
        btBack.setOnClickListener(v -> {
            Intent intent = new Intent(SegundaVistaActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}