package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityChoose extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        String nombre = getIntent().getStringExtra("nombre");

        backMainActivity(nombre);
        goToMainActivityCart(nombre);
    }

    private void goToMainActivityCart(String nombre) {
        Button button = findViewById(R.id.prepaidBtn);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivityChoose.this, MainActivityCart.class);
            intent.putExtra("nombre", nombre);
            startActivity(intent);
        });
    }

    private void backMainActivity(String nombre) {
        ImageView imageView = findViewById(R.id.backBtn2);
        imageView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivityChoose.this, MainActivityIntro.class);
            intent.putExtra("nombre", nombre);
            startActivity(intent);
        });
    }

}