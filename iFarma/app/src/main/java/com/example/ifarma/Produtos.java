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

    private EditText qtdAllegraTXT;
    private EditText qtdBupofrenoTXT;
    private EditText qtdEficaciaTXT;
    private EditText qtdDorflexTXT;
    private EditText qtdLoratamedTXT;
    private EditText qtdLuftalTXT;
    private EditText qtdRitmoneuranTXT;
    private EditText qtdSimeticonaTXT;

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
        qtdAllegraTXT = (EditText) findViewById(R.id.edtqtdAllegra);
        qtdBupofrenoTXT = (EditText) findViewById(R.id.edtqtdBupofreno);
        qtdEficaciaTXT = (EditText) findViewById(R.id.edtqtdEficacia);
        qtdDorflexTXT = (EditText) findViewById(R.id.edtqtdDorflex);
        qtdLoratamedTXT = (EditText) findViewById(R.id.edtqtdLoratamed);
        qtdLuftalTXT = (EditText) findViewById(R.id.edtqtdLuftal);
        qtdRitmoneuranTXT = (EditText) findViewById(R.id.edtqtdRitmoneuran);
        qtdSimeticonaTXT = (EditText) findViewById(R.id.edtqtdSimeticona);

        qtdAllegraTXT.setText("1");
        qtdBupofrenoTXT.setText("1");
        qtdEficaciaTXT.setText("1");
        qtdDorflexTXT.setText("1");
        qtdLoratamedTXT.setText("1");
        qtdLuftalTXT.setText("1");
        qtdRitmoneuranTXT.setText("1");
        qtdSimeticonaTXT.setText("1");

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
        qtdAllegra = Integer.parseInt(qtdAllegraTXT.getText().toString());
        qtdBupofreno = Integer.parseInt(qtdBupofrenoTXT.getText().toString());
        qtdEficacia = Integer.parseInt(qtdEficaciaTXT.getText().toString());
        qtdDorflex = Integer.parseInt(qtdDorflexTXT.getText().toString());
        qtdLoratamed = Integer.parseInt(qtdLoratamedTXT.getText().toString());
        qtdLuftal = Integer.parseInt(qtdLuftalTXT.getText().toString());
        qtdRitmoneuran = Integer.parseInt(qtdRitmoneuranTXT.getText().toString());
        qtdSimeticona = Integer.parseInt(qtdSimeticonaTXT.getText().toString());

            if (chbxAllegra.isChecked()) {
                produtosSelecionados.add((String) chbxAllegra.getText() + " - " + qtdAllegra.toString());
            }
            if (chbxBuprofeno.isChecked()) {
                produtosSelecionados.add((String) chbxBuprofeno.getText() + " - " + qtdBupofreno.toString());
            }
            if (chbxDorflex.isChecked()) {
                produtosSelecionados.add((String) chbxDorflex.getText() + " - " + qtdDorflex.toString());
            }
            if (chbxEficacia.isChecked()) {
                produtosSelecionados.add((String) chbxEficacia.getText() + " - " + qtdEficacia.toString());
            }
            if (chbxLoratamed.isChecked()) {
                produtosSelecionados.add((String) chbxLoratamed.getText() + " - " + qtdLoratamed.toString());
            }
            if (chbxLuftal.isChecked()) {
                produtosSelecionados.add((String) chbxLuftal.getText() + " - " + qtdLuftal.toString());
            }
            if (chbxRitmoneuran.isChecked()) {
                produtosSelecionados.add((String) chbxRitmoneuran.getText() + " - " + qtdRitmoneuran.toString());
            }
            if (chbxSimeticona.isChecked()) {
                produtosSelecionados.add((String) chbxSimeticona.getText() + " - " + qtdSimeticona.toString());
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