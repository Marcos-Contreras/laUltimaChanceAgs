package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriasProductos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_productos);
    }

    public void btnBotanas (View view) {
        Intent botanas = new Intent(this, Botanas.class);
        startActivity(botanas);
    }

    public void btnLacteos(View view) {
        Intent lacteos = new Intent(this, Lacteos.class);
        startActivity(lacteos);
    }

    public void btnBebidas (View view) {
        Intent bebidas = new Intent(this, Bebidas.class);
        startActivity(bebidas);
    }
}