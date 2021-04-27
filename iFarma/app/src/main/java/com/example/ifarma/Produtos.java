package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Produtos extends AppCompatActivity {
    private Button btnAdd;

    private CheckBox chbxAllegra;
    private CheckBox chbxBuprofeno;
    private CheckBox chbxDorflex;
    private CheckBox chbxEficacia;
    private CheckBox chbxLoratamed;
    private CheckBox chbxLuftal;
    private CheckBox chbxRitmoneuran;
    private CheckBox chbxSimeticona;

    private EditText qtdAllegraa;
    private EditText qtdBupofrenoo;
    private EditText qtdEficaciaa;
    private EditText qtdDorflexx;
    private EditText qtdLoratamedd;
    private EditText qtdLuftall;
    private EditText qtdRitmoneurann;
    private EditText qtdSimeticonaa;

    public static Integer qtdAllegra;
    public static Integer qtdBupofreno;
    public static Integer qtdEficacia;
    public static Integer qtdDorflex;
    public static Integer qtdLoratamed;
    public static Integer qtdLuftal;
    public static Integer qtdRitmoneuran;
    public static Integer qtdSimeticona;

    public static List<String> produtosSelecionados = new ArrayList<String>();

    public static ImageView imgdrogasil;
    public static ImageView imgultrafarma;
    public static ImageView imgdrogamais;

    private inicial classe = new inicial();
    private int farmacias = classe.farmacias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        chbxAllegra = (CheckBox) findViewById(R.id.chbxAllegra);
        chbxBuprofeno = (CheckBox) findViewById(R.id.chbxBuprofeno);
        chbxDorflex = (CheckBox) findViewById(R.id.chbxDorflex);
        chbxEficacia = (CheckBox) findViewById(R.id.chbxEficacia);
        chbxLoratamed = (CheckBox) findViewById(R.id.chbxLoratamed);
        chbxLuftal = (CheckBox) findViewById(R.id.chbxLuftal);
        chbxRitmoneuran = (CheckBox) findViewById(R.id.chbxRitmoneuran);
        chbxSimeticona = (CheckBox) findViewById(R.id.chbxSimeticona);

        //chamando editTexts
        qtdAllegraa = (EditText) findViewById(R.id.edtqtdAllegra);
        qtdBupofrenoo = (EditText) findViewById(R.id.edtqtdBupofreno);
        qtdEficaciaa = (EditText) findViewById(R.id.edtqtdEficacia);
        qtdDorflexx = (EditText) findViewById(R.id.edtqtdDorflex);
        qtdLoratamedd = (EditText) findViewById(R.id.edtqtdLoratamed);
        qtdLuftall = (EditText) findViewById(R.id.edtqtdLuftal);
        qtdRitmoneurann = (EditText) findViewById(R.id.edtqtdRitmoneuran);
        qtdSimeticonaa = (EditText) findViewById(R.id.edtqtdSimeticona);

        qtdAllegraa.setText("1");
        qtdBupofrenoo.setText("1");
        qtdEficaciaa.setText("1");
        qtdDorflexx.setText("1");
        qtdLoratamedd.setText("1");
        qtdLuftall.setText("1");
        qtdRitmoneurann.setText("1");
        qtdSimeticonaa.setText("1");

        //chamando imagens
        imgdrogasil = (ImageView) findViewById(R.id.imgfarmadrogasil);
        imgultrafarma = (ImageView) findViewById(R.id.imgultrafarma);
        imgdrogamais = (ImageView) findViewById(R.id.imgdrogamais);

        apacererImagem();

        btnAdd = findViewById(R.id.btnadd);

        //CASO O BOTAO SEJA CLICADO
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChecarProdutos();
                startActivity(new Intent(Produtos.this, Carrinho.class));
            }
        });
    }

    public void ChecarProdutos() {
            if (chbxAllegra.isChecked()) {
                produtosSelecionados.add((String) chbxAllegra.getText());
            }
            if (chbxBuprofeno.isChecked()) {
                produtosSelecionados.add((String) chbxBuprofeno.getText());
            }
            if (chbxDorflex.isChecked()) {
                produtosSelecionados.add((String) chbxDorflex.getText());
            }
            if (chbxEficacia.isChecked()) {
                produtosSelecionados.add((String) chbxEficacia.getText());
            }
            if (chbxLoratamed.isChecked()) {
                produtosSelecionados.add((String) chbxLoratamed.getText());
            }
            if (chbxLuftal.isChecked()) {
                produtosSelecionados.add((String) chbxLuftal.getText());
            }
            if (chbxRitmoneuran.isChecked()) {
                produtosSelecionados.add((String) chbxRitmoneuran.getText());
            }
            if (chbxSimeticona.isChecked()) {
                produtosSelecionados.add((String) chbxSimeticona.getText());
            }
            if (produtosSelecionados.isEmpty()) {
                Toast.makeText(Produtos.this, "Nenhum Medicamento Adicionado", Toast.LENGTH_SHORT).show();
            } else {
                chbxSimeticona.setChecked(false);
                chbxRitmoneuran.setChecked(false);
                chbxLuftal.setChecked(false);
                chbxLoratamed.setChecked(false);
                chbxDorflex.setChecked(false);
                chbxBuprofeno.setChecked(false);
                chbxAllegra.setChecked(false);

                qtdAllegra = Integer.parseInt(qtdAllegraa.getText().toString());
                qtdBupofreno = Integer.parseInt(qtdBupofrenoo.getText().toString());
                qtdEficacia = Integer.parseInt(qtdEficaciaa.getText().toString());
                qtdDorflex = Integer.parseInt(qtdDorflexx.getText().toString());
                qtdLoratamed = Integer.parseInt(qtdLoratamedd.getText().toString());
                qtdLuftal = Integer.parseInt(qtdLuftall.getText().toString());
                qtdRitmoneuran = Integer.parseInt(qtdRitmoneurann.getText().toString());
                qtdSimeticona = Integer.parseInt(qtdSimeticonaa.getText().toString());

                startActivity(new Intent(Produtos.this, Carrinho.class));
            }
    }

    public void apacererImagem() {
        if (farmacias == 1) {
            imgdrogasil.setVisibility(View.VISIBLE);
        } else if (farmacias == 2) {
            imgultrafarma.setVisibility(View.VISIBLE);
        } else {
            imgdrogamais.setVisibility(View.VISIBLE);
        }
    }
}