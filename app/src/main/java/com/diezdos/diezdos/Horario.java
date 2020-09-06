package com.diezdos.diezdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Horario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
    }

    public void imageHome(View view) {
        Intent hIntent = new Intent(Horario.this, Home.class);
        startActivity(hIntent);
    }
    public void imageSearch(View view) {
        Intent sIntent = new Intent(Horario.this, Pagina.class);
        startActivity(sIntent);
    }
    public void imageBeta (View view){
        Intent bIntent = new Intent(Horario.this, Beta.class);
        startActivity(bIntent);
    }
}