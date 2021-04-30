package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

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
                Intent DROGASIL = new Intent(v.getContext(), Drogasil.class);
                startActivity(DROGASIL);
            }
        });

        //LEVA PARA A TELA PRODUTOS


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
     public void irparatelaproduto(){
        startActivity(new Intent(inicial.this, Produtos.class));
    }


}