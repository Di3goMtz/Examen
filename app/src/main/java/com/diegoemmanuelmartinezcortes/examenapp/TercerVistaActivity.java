package com.diegoemmanuelmartinezcortes.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TercerVistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercervista);

        Button btBack = findViewById(R.id.buttonBack2);
        btBack.setOnClickListener(v -> {
            Intent intent = new Intent(TercerVistaActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}