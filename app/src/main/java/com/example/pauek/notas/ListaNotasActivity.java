package com.example.pauek.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaNotasActivity extends AppCompatActivity {

    private ListView lista_notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notas);

        lista_notas = (ListView) findViewById(R.id.lista_notas);
        lista_notas.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new String[]{"hola", "que", "tal"}
        ));
    }
}
