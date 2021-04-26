package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Carrinho extends AppCompatActivity {


    private Produtos classe = new Produtos();
    private Double var=classe.total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);



        final EditText vl =(EditText)findViewById(R.id.edttotal);
        vl.setEnabled(false);
        vl.setText("R$ "+var.toString());





    }



}