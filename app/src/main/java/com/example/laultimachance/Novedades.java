package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Novedades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novedades);
    }

    public void descProduct(View view) {
        Intent des = new Intent(this, ProductoBotanas1.class);
        startActivity(des);
    }

    public void btnAnadir(View view) {
        Intent anadir = new Intent(this, Carro.class);
        startActivity(anadir);
    }
}