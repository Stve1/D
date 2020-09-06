package com.diezdos.diezdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pagina extends AppCompatActivity {

    private WebView miwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina);

        miwebView = findViewById(R.id.webView);
        miwebView.getSettings().setJavaScriptEnabled(true);
        miwebView.setWebViewClient(new WebViewClient());
        miwebView.loadUrl("https://leonidasrubio.colegiosonline.com/");
    }
    public void onBackPressed() {

        if(miwebView.canGoBack()){
            miwebView.goBack();
        }else{
            super.onBackPressed();
        }

    }
    public void imageHome(View view){
        Intent hIntent = new Intent(Pagina.this,Home.class);
        startActivity(hIntent);
    }
    public void imageCalendar(View view){
        Intent sIntent = new Intent(Pagina.this,Horario.class);
        startActivity(sIntent);
    }
    public void imageBeta(View view){
        Intent bIntent = new Intent(Pagina.this, Beta.class);
        startActivity(bIntent);
    }

}