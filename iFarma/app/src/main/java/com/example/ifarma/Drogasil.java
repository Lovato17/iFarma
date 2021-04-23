package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Drogasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drogasil);
        //DECLARANDO O WEBVIEW
        WebView Wv = (WebView)findViewById(R.id.webview);
        //REDIRECIONANDO PARA A PAGINA DESEJADA
        Wv.loadUrl("https://www.google.com/maps/place/Drogasil/@-23.511006,-46.8762326,20z/data=!4m9!1m2!2m1!1sDrogasil!3m5!1s0x0:0xf553885bd7d0f471!8m2!3d-23.5109724!4d-46.8760115!15sCghEcm9nYXNpbCIDiAEBWhQKCGRyb2dhc2lsIghkcm9nYXNpbJIBCHBoYXJtYWN5");
        WebSettings ws= Wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

    }
}