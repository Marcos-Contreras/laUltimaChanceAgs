package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnNoAccount(View view) {
        Intent toRegister = new Intent(this, Register.class);
        startActivity(toRegister);
    }

    public void btnToForgotPassword(View view) {
        Intent toForgotPassword = new Intent(this, forgotpassword.class);
        startActivity(toForgotPassword);
    }

    public void btnIniciarSesion(View view) {
        Intent toPaginaPrincipal = new Intent(this, PaginaPrincipal.class);
        startActivity(toPaginaPrincipal);
    }
}