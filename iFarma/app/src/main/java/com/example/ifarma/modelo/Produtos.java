package com.example.ifarma.modelo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import androidx.appcompat.app.AppCompatActivity;

import com.example.ifarma.R;


public class Produtos extends AppCompatActivity {
    private Button addcarrinho;
    private EditText edttotal;
    private NumberPicker nbpquantidade;
    private RadioButton rbprodutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        addcarrinho = (Button) findViewById(R.id.btnadd);
        edttotal = findViewById(R.id.edttotal);
        nbpquantidade = findViewById(R.id.nbpquantidade);
    }


    public void ProdutoSelecionados(){

    }
}
