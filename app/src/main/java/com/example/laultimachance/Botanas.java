package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Botanas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botanas);
    }

    public void btnAñadir (View view) {
        Intent añadir = new Intent(this, Carro.class);
        startActivity(añadir);
    }

    public void descProduct(View view) {
        Intent des = new Intent(this, ProductoBotanas1.class);
        startActivity(des);
    }
}