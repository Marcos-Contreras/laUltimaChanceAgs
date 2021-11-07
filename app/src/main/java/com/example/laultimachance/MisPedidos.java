package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;

public class MisPedidos extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_pedidos);
        recycler = (RecyclerView) findViewById(R.id.recyclerPedidos);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<String>();

        for (int i=0; i<=3;i++){
            listDatos.add("Pedido "+i+" ");
        }

        AdapterData adapter=new AdapterData(listDatos);
        recycler.setAdapter(adapter);
    }

}