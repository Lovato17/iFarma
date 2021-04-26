package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Toast;

public class Produtos extends AppCompatActivity {
    private Button btnAdd;

    private CheckBox chbxAllegra ;
    private CheckBox chbxBuprofeno;
    private CheckBox chbxDorflex;
    private CheckBox chbxEficacia;
    private CheckBox chbxLoratamed;
    private CheckBox chbxLuftal;
    private CheckBox chbxRitmoneuran;
    private CheckBox chbxSimeticona;
   /*/ private NumberPicker qtdallegra;
    private NumberPicker qtdbuprofeno;
    private NumberPicker qtddorflex;
    private NumberPicker qtdeficacia;
    private NumberPicker qtdloratamed;
    private NumberPicker qtdlufital;
    private NumberPicker qtdritmoneuran;
    private NumberPicker qtdsimeticona;/*/
    public static double total = 0;
    public static ImageView imgdrogasil;
    public static ImageView imgultrafarma;
    public static ImageView imgdrogamais;
    private inicial classe = new inicial();
    private int farmacias=classe.farmacias;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        chbxAllegra=(CheckBox) findViewById(R.id.chbxAllegra);
        chbxBuprofeno=(CheckBox) findViewById(R.id.chbxBuprofeno);
        chbxDorflex=(CheckBox) findViewById(R.id.chbxDorflex);
        chbxEficacia=(CheckBox) findViewById(R.id.chbxEficacia);
        chbxLoratamed=(CheckBox) findViewById(R.id.chbxLoratamed);
        chbxLuftal=(CheckBox) findViewById(R.id.chbxLuftal);
        chbxRitmoneuran=(CheckBox) findViewById(R.id.chbxRitmoneuran);
        chbxSimeticona=(CheckBox) findViewById(R.id.chbxSimeticona);

        //chamando imagens
        imgdrogasil=(ImageView)findViewById(R.id.imgfarmadrogasil);
        imgultrafarma=(ImageView)findViewById(R.id.imgultrafarma);
        imgdrogamais=(ImageView)findViewById(R.id.imgdrogamais);


        //declarando valor maximo e minimo de cada NUMBERPICK
        /*/qtdallegra=(NumberPicker)findViewById(R.id.qtdallegra);
        qtdallegra.setMinValue(0);
        qtdallegra.setMaxValue(100);
        qtdallegra.setWrapSelectorWheel(false);
        qtdallegra.setValue(0);

        qtdbuprofeno=(NumberPicker)findViewById(R.id.qtdbupofeno);
        qtdbuprofeno.setMinValue(0);
        qtdbuprofeno.setMaxValue(100);
        qtdbuprofeno.setWrapSelectorWheel(false);
        qtdbuprofeno.setValue(0);

        qtddorflex=(NumberPicker)findViewById(R.id.qtddorflex);
        qtddorflex.setMinValue(0);
        qtddorflex.setMaxValue(100);
        qtddorflex.setWrapSelectorWheel(false);
        qtddorflex.setValue(0);

        qtdeficacia=(NumberPicker)findViewById(R.id.qtdeficacia);
        qtdeficacia.setMinValue(0);
        qtdeficacia.setMaxValue(100);
        qtdeficacia.setWrapSelectorWheel(false);
        qtdeficacia.setValue(0);

        qtdloratamed=(NumberPicker)findViewById(R.id.qtdloratamed);
        qtdloratamed.setMinValue(0);
        qtdloratamed.setMaxValue(100);
        qtdloratamed.setWrapSelectorWheel(false);
        qtdloratamed.setValue(0);

        qtdlufital=(NumberPicker)findViewById(R.id.qtdluftal);
        qtdlufital.setMinValue(0);
        qtdlufital.setMaxValue(100);
        qtdlufital.setWrapSelectorWheel(false);
        qtdlufital.setValue(0);

        qtdritmoneuran=(NumberPicker)findViewById(R.id.qtdritmoneuran);
        qtdritmoneuran.setMinValue(0);
        qtdritmoneuran.setMaxValue(100);
        qtdritmoneuran.setWrapSelectorWheel(false);
        qtdritmoneuran.setValue(0);

        qtdsimeticona=(NumberPicker)findViewById(R.id.qtdsimeticona);
        qtdsimeticona.setMinValue(0);
        qtdsimeticona.setMaxValue(100);
        qtdsimeticona.setWrapSelectorWheel(false);
        qtdsimeticona.setValue(0);/*/

        apacererImagem();

        btnAdd=findViewById(R.id.btnadd);


        //CASO O BOTAO SEJA CLICADO

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                CheckedTrue();
                startActivity(new Intent(Produtos.this, Carrinho.class));


            }
        });




    }


    public void CheckedTrue(){
        double a,b,d,e,lo,lu,r,s ;
        {
        if (chbxAllegra.isChecked()){

            a=10/*/*qtdallegra.getValue()/*/;

            }
        else
        {
               a=0;
        }}
        {
        if(chbxBuprofeno.isChecked()){
            b=7/*/*qtdbuprofeno.getValue()/*/;
        }
        else {
            b=0;
        }}
        {
            if (chbxDorflex.isChecked()) {
                d = 5/*/*qtddorflex.getValue()/*/;
            } else {
                d = 0;
            }
        }
        {
        if (chbxEficacia.isChecked()){
            e=15/*/*qtdeficacia.getValue()/*/;
        }
        else{
            e=0;
          }
        }
        {
        if(chbxLoratamed.isChecked()){
            lo=8/*/*qtdloratamed.getValue()/*/;
        }
        else{
            lo=0;
        }}
        {
        if (chbxLuftal.isChecked()){
            lu=10/*/*qtdlufital.getValue()/*/;
        }
        else{
        lu=0;
        }}
        {
            if (chbxRitmoneuran.isChecked()){
                r=12/*/*qtdritmoneuran.getValue()/*/;

            }
            else{
                r=0;
            }
            if (chbxSimeticona.isChecked()){
                s=10/*/*qtdsimeticona.getValue()/*/;
            }
            else{
                s=0;
            }
        }






        total=a+b+d+e+lo+lu+r+s;


        if(total==0){
            Toast.makeText(Produtos.this, "Nenhum Medicamento Adicionado", Toast.LENGTH_SHORT).show();
        }else
        {
            startActivity(new Intent(Produtos.this, Carrinho.class));
        }


    }
    public void apacererImagem(){
        if (farmacias==1){
            imgdrogasil.setVisibility(View.VISIBLE);
        }
        else if (farmacias==2){
            imgultrafarma.setVisibility(View.VISIBLE);
        }
        else{
            imgdrogamais.setVisibility(View.VISIBLE);
        }

    }
}