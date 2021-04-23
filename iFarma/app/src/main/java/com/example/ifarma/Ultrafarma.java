package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Ultrafarma extends AppCompatActivity {

    private WebView Wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultrafarma);
        Wv = (WebView)findViewById(R.id.webview3);
        Wv.loadUrl("https://www.google.com/maps/place/Ultrafarma+Popular+Nova+Cantareira/@-23.4878856,-46.6390096,14z/data=!4m9!1m2!2m1!1sultrafarma!3m5!1s0x94cef72c30600ff1:0xe271cab7f683b656!8m2!3d-23.4878178!4d-46.6215682!15sCgp1bHRyYWZhcm1hWhgKCnVsdHJhZmFybWEiCnVsdHJhZmFybWGSAQhwaGFybWFjeQ");
        WebSettings ws= Wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
    }
}