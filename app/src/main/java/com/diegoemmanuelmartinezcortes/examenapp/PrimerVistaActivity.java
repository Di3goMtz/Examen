package com.diegoemmanuelmartinezcortes.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class PrimerVistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_primervista);

        Button btBack = findViewById(R.id.button8);
        btBack.setOnClickListener(v -> {
            Intent intent = new Intent(PrimerVistaActivity.this, MenuActivity.class);
            startActivity(intent);
        });

        Button btSearch1 = findViewById(R.id.button4);
        btSearch1.setOnClickListener(v -> {
            Toast.makeText(this, "Selecciona La ubicacion de donde estas", Toast.LENGTH_SHORT).show();
        });

        Button btSearch2 = findViewById(R.id.button5);
        btSearch2.setOnClickListener(v -> {
            Toast.makeText(this, "Selecciona La ubicacion a donde quieres ir", Toast.LENGTH_SHORT).show();
        });

        Button btHome = findViewById(R.id.button6);
        btHome.setOnClickListener(v -> {
            Toast.makeText(this, "Ubicacion de tu casa", Toast.LENGTH_SHORT).show();
        });
    }
}