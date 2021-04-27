package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

public class Carrinho extends AppCompatActivity {

    private Produtos classe = new Produtos();
    private List<String> produtosSelecionados = Produtos.produtosSelecionados;
    private TextView txtProdutos;
    private String nome, resto;
    private double preco = 0, qtd = 0, precoTotal = 0;
    private int idTxt = 1, idBtn = 1;

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
                resto = informacao.split(divisao)[1];

                divisao = " - ";

                preco = Double.parseDouble(resto.split(divisao)[0]);
                qtd = Double.parseDouble(resto.split(divisao)[1]);

                String ProdutossTXT = (String) ProdutoTXT.getText();
                if (ProdutossTXT.contains(nome)){
                }
                else{
                    ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.carrinho);
                    ConstraintSet set = new ConstraintSet();
                    set.clone(layout);

                    TextView produto = new TextView(this);
                    produto.setText("\n Nome - " + nome +  " Preço unitario - " + preco + " Quantidade - " + qtd + " Preço - " + (preco * qtd));
                    produto.setId(idTxt);           // <-- Important
                    layout.addView(produto);
                    set.connect(produto.getId(), ConstraintSet.TOP, idTxt, ConstraintSet.BOTTOM, 15); //Onde ele encosta em cima
                    set.connect(produto.getId(), ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0); //Onde ele encosta na direita
                    set.connect(produto.getId(), ConstraintSet.LEFT,ConstraintSet.PARENT_ID, idBtn,0); //Onde ele encosta na esquerda
                    set.constrainHeight(produto.getId(), 200);

                    //botao
                    Button button = new Button(this);
                    button.setText(nome);
                    button.setId(idBtn);
                    layout.addView(button);
                    set.connect(button.getId(), ConstraintSet.TOP, idBtn, ConstraintSet.BOTTOM, 15); //Onde ele encosta em cima
                    set.connect(button.getId(),ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,2); //Onde ele encosta na direita
                    set.connect(button.getId(),ConstraintSet.LEFT,ConstraintSet.PARENT_ID, idTxt,0); //Onde ele encosta na esquerda
                    set.constrainHeight(button.getId(), 200);

                    set.applyTo(layout); // Aplica

                precoTotal += preco;
                idTxt++;
                idBtn++;
                }
            }
            catch (Exception erro){
                ProdutoTXT.setText(erro.toString());
            }
        }
    }
}