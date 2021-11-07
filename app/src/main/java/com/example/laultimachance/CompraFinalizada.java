package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CompraFinalizada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_finalizada);
    }

    public void btnPurchaseCompleted(View view) {
        Intent toPaginaPrincipal = new Intent(this, PaginaPrincipal.class);
        startActivity(toPaginaPrincipal);
    }
}