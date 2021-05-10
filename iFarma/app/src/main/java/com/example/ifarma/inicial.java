package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

public class inicial extends AppCompatActivity {

    private Button Drogasil;
    private Button Ultrafarma;
    private Button Logout;
    private Button Drogamais;
    private Button btndrogasil;
    private Button btnult;
    private Button btndrogmais;
    public static int farmacias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);



        //DECLARANDO OS BOTOES
        Logout = (Button)findViewById(R.id.btnLogout);

        Drogasil=(Button)findViewById(R.id.btn_drograsil);
        Ultrafarma=(Button)findViewById(R.id.btn_ultrafarma);
        Drogamais=(Button)findViewById(R.id.btn_drogamais);



        btndrogasil=(Button)findViewById(R.id.btndg);


        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(inicial.this, MainActivity.class));

            }
        });


        btndrogasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                farmacias= 1;
                irparatelaproduto();
            }
        });

        btnult = (Button)findViewById(R.id.btnult);
        btnult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               farmacias= 2;
                irparatelaproduto();
            }
        });

        btndrogmais = (Button)findViewById(R.id.btndrogmais);
        btndrogmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                farmacias= 3;
            irparatelaproduto();
            }
        });

        //LEVA PARA A TELA AONDE HÁ O WEBVIEW DA DROGASIL
        Drogasil.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                //DEFINIMOS A URL
                final String url = "https://maps.google.com?saddr=Current+Location&daddr=%s,%s";
                // LAT E LONG DO LOCAL DO APP
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse( String.format(Locale.getDefault(),url, "-23.511006", "-46.8762326") ));
                // ABRIR A TELA DO MAPS
                it.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                //ABRE A ACTIVITY
                startActivity(it);





            }
        });

        //LEVA PARA A TELA PRODUTOS


        Ultrafarma.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                //DEFINIMOS A URL
                final String url = "https://maps.google.com?saddr=Current+Location&daddr=%s,%s";
                // LAT E LONG DO LOCAL DO APP
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse( String.format(Locale.getDefault(),url, "-23.4878856", "-46.6390096") ));
                // ABRIR A TELA DO MAPS
                it.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                //ABRE A ACTIVITY
                startActivity(it);
            }
        });

        Drogamais.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                //DEFINIMOS A URL
                final String url = "https://maps.google.com?saddr=Current+Location&daddr=%s,%s";
                // LAT E LONG DO LOCAL DO APP
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse( String.format(Locale.getDefault(),url, "-23.487869", "-46.6915405") ));
                // ABRIR A TELA DO MAPS
                it.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                //ABRE A ACTIVITY
                startActivity(it);
            }
        });
    }
     public void irparatelaproduto(){
        startActivity(new Intent(inicial.this, Produtos.class));
    }


}