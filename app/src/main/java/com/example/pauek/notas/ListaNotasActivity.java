package com.example.pauek.notas;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaNotasActivity extends AppCompatActivity {

    private ArrayList<Nota> notas;
    private ListView lista_notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notas);

        notas = new ArrayList<>();
        notas.add(new Nota("hola", "que tal"));
        notas.add(new Nota("1234", "como estamos asdfasdlfjasldkfj asdlkfjasldkfjasdlfkjasdlfkjasdlfkjas dflkasjdf alskdfjasldkfjasdlfkjasdflkajsdflkasdjfalskdfjasdlfkj "));

        lista_notas = (ListView) findViewById(R.id.lista_notas);
        lista_notas.setAdapter(new NotasAdapter());
    }

    class NotasAdapter extends ArrayAdapter<Nota> {
        public NotasAdapter() {
            super(ListaNotasActivity.this, R.layout.nota, notas);
        }

        @NonNull
        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                LayoutInflater inflater = getLayoutInflater();
                view = inflater.inflate(R.layout.nota, parent, false);
            }

            Nota nota = getItem(i);
            TextView titulo = (TextView) view.findViewById(R.id.titulo);
            titulo.setText(nota.getTitulo());
            TextView resumen = (TextView) view.findViewById(R.id.resumen);
            resumen.setText(nota.getTexto());

            return view;
        }
    }
}
