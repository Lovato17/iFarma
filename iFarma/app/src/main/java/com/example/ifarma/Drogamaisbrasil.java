package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Drogamaisbrasil extends AppCompatActivity {

    private WebView Wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drogamaisbrasil);
        Wv = (WebView)findViewById(R.id.webview4);
        Wv.loadUrl("https://www.google.com/maps/place/Droga+Mais+Brasil+-+Rafaela+Farma/@-23.487869,-46.6915405,12z/data=!4m9!1m2!2m1!1sdrogamais+brasil!3m5!1s0x94cef50df0d97889:0x5c1934cec0e247dc!8m2!3d-23.4562197!4d-46.5454998!15sChBkcm9nYW1haXMgYnJhc2lsIgOIAQFaJAoQZHJvZ2FtYWlzIGJyYXNpbCIQZHJvZ2FtYWlzIGJyYXNpbJIBCWRydWdzdG9yZQ");
        WebSettings ws= Wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
    }
}