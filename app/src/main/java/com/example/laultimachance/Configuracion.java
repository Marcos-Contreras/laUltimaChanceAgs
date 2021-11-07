package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }

    public void btnTerminos(View view) {
        Intent toTerminos = new Intent(this, Terminos.class);
        startActivity(toTerminos);
    }

    public void btnUbicanos(View view) {
        Intent toUbicanos = new Intent(this, Ubicanos.class);
        startActivity(toUbicanos);
    }
}