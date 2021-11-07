package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Terminos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent backToConfig = new Intent(this, Configuracion.class);
        startActivity(backToConfig);
        finish();
    }
}