package com.diegoemmanuelmartinezcortes.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btFist = findViewById(R.id.button);
        btFist.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, PrimerVistaActivity.class);
            startActivity(intent);

        });

        Button btTwo = findViewById(R.id.button2);
        btTwo.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SegundaVistaActivity.class);
            startActivity(intent);

        });

        Button btThree = findViewById(R.id.button);
        btThree.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, TercerVistaActivity.class);
            startActivity(intent);

        });
    }
}