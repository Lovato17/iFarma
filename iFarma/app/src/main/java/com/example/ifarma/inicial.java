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