package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Carrinho extends AppCompatActivity {

    private Produtos classe = new Produtos();
    private List<String> produtosSelecionados = Produtos.produtosSelecionados;
    private TextView txtProdutos;

    private Button Finalizar;
    private Button voltar;
    private String nome, resto;
    private double preco = 0, qtd = 0, precoTotal = 0;
    private int idTxt = 1, idBtn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        final TextView txtQTD = (TextView) findViewById(R.id.txtQuantidade);
        final Button btnexcluir = (Button)findViewById(R.id.btnExcluir);
        final TextView txtValor = (TextView)findViewById(R.id.txtTotal);
        final TextView ProdutoTXT = (TextView) findViewById(R.id.txtProdutos);
        final EditText totalEDT = (EditText) findViewById(R.id.edttotal);
        Finalizar = (Button) findViewById(R.id.btn_finalizar);

        btnexcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //produtosSelecionados.add(" ");
                totalEDT.setText("");
                txtQTD.setText("");
                txtValor.setText("");
                ProdutoTXT.setText("");
                produtosSelecionados.clear();
                precoTotal = 0;
                Toast.makeText(Carrinho.this, "Compra Excluida Com Sucesso!!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Carrinho.this, Produtos.class));

            }
        });
        Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //produtosSelecionados.add(" ");
                totalEDT.setText("");
                txtQTD.setText("");
                txtValor.setText("");
                ProdutoTXT.setText("");
                produtosSelecionados.clear();
                precoTotal = 0;
                Toast.makeText(Carrinho.this, "Compra Finalizada Com Sucesso!!", Toast.LENGTH_SHORT).show();

               startActivity(new Intent(Carrinho.this, inicial.class));

            }
        });
       voltar = (Button) findViewById(R.id.btn_voltar_produtos);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Carrinho.this, Produtos.class));
            }
        });
        txtQTD.setText("");
        txtValor.setText("");
        ProdutoTXT.setText("");

        try {
            for (String informacao : produtosSelecionados ) {
                String divisao = " R\\$ ";
                nome = informacao.split(divisao)[0];
                resto = informacao.split(divisao)[1];

                divisao = " - ";

                preco = Double.parseDouble(resto.split(divisao)[0]);
                qtd = Double.parseDouble(resto.split(divisao)[1]);

                String ProdutossTXT = (String) ProdutoTXT.getText();
                if (ProdutossTXT.contains(nome)){
                }
                else{
                    ProdutoTXT.setText(ProdutoTXT.getText() + "\n"+"|       " + nome);
                    txtQTD.setText(txtQTD.getText() + "\n"+"|           "+qtd);
                    txtValor.setText(txtValor.getText() + "\n"+"|           "+preco * qtd);

                    precoTotal += preco*qtd;
                    idTxt++;
                    idBtn++;
                }
            }
            totalEDT.setText("R$ " + precoTotal);
        }
        catch (Exception erro){
            ProdutoTXT.setText(erro.toString());
        }
    }

}