package com.example.cronometro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class resultados extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

       webView = (WebView) findViewById(R.id.WebViewResultados);
       webView.setWebViewClient(new WebViewClient());
       webView.loadUrl("https://actc.org.ar/tc/resultados.html");
    }

    public void Atras(View view){
        Intent Atras = new Intent(this, MainActivity.class);
        startActivity(Atras);
    }
}