package com.diezdos.diezdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Calendar;

public class Beta extends AppCompatActivity {

    private WebView miwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);

        miwebView = findViewById(R.id.webView);
        miwebView.getSettings().setJavaScriptEnabled(true);
        miwebView.setWebViewClient(new WebViewClient());
        miwebView.loadUrl("https://leonidasrubio.edu.co/lrv2/");

    }
    public void onBackPressed() {

        if(miwebView.canGoBack()){
            miwebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
    public void imageHome (View view){
        Intent hIntent = new Intent(Beta.this, Home.class);
        startActivity(hIntent);
    }
    public void imageCalendar (View view){
        Intent cIntent = new Intent(Beta.this, Horario.class);
        startActivity(cIntent);
    }
    public void imageSearch (View view){
        Intent pIntent = new Intent(Beta.this, Pagina.class);
        startActivity(pIntent);
    }
}