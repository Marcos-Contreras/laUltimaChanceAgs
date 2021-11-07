package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductoBebidas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_bebidas1);
    }

    public void btnAñadir(View view) {
        Intent añadir = new Intent(this, Carro.class);
        startActivity(añadir);
    }

    public void btnComprar(View view) {
        Intent comprar = new Intent(this, Checkout.class);
        startActivity(comprar);
    }
}