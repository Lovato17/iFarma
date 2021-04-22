package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class inicial extends AppCompatActivity {

    private Button Drogasil;
    private Button Ultrafarma;
    private Button Drogamais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        //DECLARANDO O WEBVIEW
        WebView Wv = (WebView)findViewById(R.id.webview1);
        //REDIRECIONANDO PARA A PAGINA DESEJADA
        Wv.loadUrl("https://www.google.com/maps/place/Drograria+Brasil/@-16.4446611,-51.1240552,16z/data=!4m9!1m2!2m1!1sdrograria+brasil!3m5!1s0x9366bd1daea4db13:0x85b0bd79678932fe!8m2!3d-16.4446393!4d-51.1197004!15sChBkcm9ncmFyaWEgYnJhc2lsWh0KCWRyb2dyYXJpYSIQZHJvZ3JhcmlhIGJyYXNpbJIBCWRydWdzdG9yZQ");
        WebSettings ws= Wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);


        //DECLARANDO OS BOTOES
        Drogasil=(Button)findViewById(R.id.btn_drograsil);
        Ultrafarma=(Button)findViewById(R.id.btn_ultrafarma);
        Drogamais=(Button)findViewById(R.id.btn_drogamais);

        //LEVA PARA A TELA AONDE HÁ O WEBVIEW DA DROGASIL
        Drogasil.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent DROGASIL = new Intent(v.getContext(), Drogasil.class);
                startActivity(DROGASIL);
            }
        });

        Ultrafarma.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                //LEVA PARA A TELA AONDE HÁ O WEBVIEW DA ULTRAFARMA
                Intent ULTRAFARMA = new Intent(v.getContext(), Ultrafarma.class);
                startActivity(ULTRAFARMA);
            }
        });

        Drogamais.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                //LEVA PARA A TELA AONDE HÁ O WEBVIEW DA DROGAMAIS BRASIL
                Intent DROGAMAISBRASIL = new Intent(v.getContext(), Drogamaisbrasil.class);
                startActivity(DROGAMAISBRASIL);
            }
        });

    }
}