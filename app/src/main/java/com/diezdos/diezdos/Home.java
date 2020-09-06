package com.diezdos.diezdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Home extends AppCompatActivity {

    private WebView miwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        miwebView = findViewById(R.id.webView);
        miwebView.getSettings().setJavaScriptEnabled(true);
        miwebView.setWebViewClient(new WebViewClient());
        miwebView.loadUrl("https://diezdos.000webhostapp.com/");
    }

    public void imageCalendar(View view) {
        Intent fIntent = new Intent(Home.this, Horario.class);
        startActivity(fIntent);
    }

    public void imageSearch(View view) {
        Intent sIntent = new Intent(Home.this, Pagina.class);
        startActivity(sIntent);

    }
    public void imageBeta(View view) {
        Intent sIntent = new Intent(Home.this, Beta.class);
        startActivity(sIntent);
    }

    public void botonCastellano(View view) {
        Intent botonKastellanoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/cqa-igcu-jsh"));
        startActivity(botonKastellanoIntent);
    }

    public void botonFilo(View view) {
        Intent botonFilosIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/jmk-mskp-pph"));
        startActivity(botonFilosIntent);
    }

    public void botonFisica(View view) {
        Intent botonFisicaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/rwz-tcpj-wyq"));
        startActivity(botonFisicaIntent);
    }

    public void botonIngles(View view) {
        Intent botonInglesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/gpd-bahu-ftr"));
        startActivity(botonInglesIntent);
    }

    public void botonLabingles(View view) {
        Intent botonLabinglesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/tpw-vied-atk"));
        startActivity(botonLabinglesIntent);
    }

    public void botonMatematicas(View view) {
        Intent botonMatematicasIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/rwz-tcpj-wyq"));
        startActivity(botonMatematicasIntent);
    }

    public void botonQuimica(View view) {
        Intent botonQuimicaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/wsr-qmwf-zmj"));
        startActivity(botonQuimicaIntent);
    }

    public void botonJulie(View view) {
        Intent botonJulieIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/itf-khnt-mfo"));
        startActivity(botonJulieIntent);
    }

    public void botonSociales(View view) {
        Intent botonSocialesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/ycx-rzag-mui"));
        startActivity(botonSocialesIntent);
    }

    public void botonEtica(View view) {
        Intent botonEticaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/eif-ouus-bbn"));
        startActivity(botonEticaIntent);
    }

    public void botonEfisica(View view) {
        Intent botonEfisicaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/kiz-jqcp-qva"));
        startActivity(botonEfisicaIntent);
    }

    public void botonInfor(View view) {
        Intent botonInforIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/mmp-twpt-gad"));
        startActivity(botonInforIntent);
    }

    public void botonArt(View view) {
        Intent botonArtisIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/wko-qysf-xbw"));
        startActivity(botonArtisIntent);
    }
}