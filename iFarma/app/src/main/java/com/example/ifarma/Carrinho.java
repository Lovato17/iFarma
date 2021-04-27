package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

public class Carrinho extends AppCompatActivity {

    private Produtos classe = new Produtos();
    private List<String> produtosSelecionados = Produtos.produtosSelecionados;
    private TextView txtProdutos;
    private String nome;
    private double preco = 0, precoTotal = 0;


    private static Integer qtdAllegra = Integer.parseInt(Produtos.qtdAllegra.toString());
    private Integer qtdBupofreno = Integer.parseInt(Produtos.qtdBupofreno.toString());
    private Integer qtdEficacia = Integer.parseInt(Produtos.qtdEficacia.toString());
    private Integer qtdDorflex = Integer.parseInt(Produtos.qtdDorflex.toString());
    private Integer qtdLoratamed = Integer.parseInt(Produtos.qtdLoratamed.toString());
    private Integer qtdLuftal = Integer.parseInt(Produtos.qtdLuftal.toString());
    private Integer qtdRitmoneuran = Integer.parseInt(Produtos.qtdRitmoneuran.toString());
    private Integer qtdSimeticona = Integer.parseInt(Produtos.qtdSimeticona.toString());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        final TextView ProdutoTXT = (TextView) findViewById(R.id.txtProdutos);
        ProdutoTXT.setText("");

        for (String informacao : produtosSelecionados ) {
            try {
                String divisao = " R\\$ ";
                nome = informacao.split(divisao)[0];
                preco = Double.parseDouble(informacao.split(divisao)[1]);
                String ProdutossTXT = (String) ProdutoTXT.getText();

                if (ProdutossTXT.contains(nome)){
                }
                else{
                    ProdutoTXT.setText(ProdutoTXT.getText() + "\n" + nome + " ");
                    if ("qtdDorflex".contains(nome)) {preco *=  qtdDorflex; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdDorflex);} if ("qtdAllegra".toString().contains(nome)) {preco *= qtdAllegra; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdAllegra);} if ("qtdBupofreno".toString().contains(nome)) {preco *= qtdBupofreno; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdBupofreno);} if ("qtdLoratamed".toString().contains(nome)) {preco *= qtdLoratamed; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdLoratamed);} if ("qtdLuftal".toString().contains(nome)) {preco *= qtdLuftal; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdLuftal);} if ("qtdRitmoneuran".toString().contains(nome)) {preco *= qtdRitmoneuran; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdRitmoneuran);} if ("qtdSimeticona".toString().contains(nome)) {preco *= qtdSimeticona; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdSimeticona);} if ("qtdEficacia".toString().contains(nome)) {preco *= qtdEficacia; ProdutoTXT.setText(ProdutoTXT.getText().toString() + qtdEficacia);}
                    ProdutoTXT.setText(ProdutoTXT.getText().toString() + " " + preco);

                precoTotal += preco;
                }
            }
            catch (Exception erro){
                ProdutoTXT.setText(erro.toString());
            }
        }
    }
}