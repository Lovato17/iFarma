package com.example.ifarma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ifarma.modelo.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    //DECLARANDO O TIPO E A VARIAVEL DO BOTAO
    private EditText edtemail;
    private EditText edtsenha;
    private Button Btn_logar;
    private Button Btn_cadastrar;
    private Usuario User;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DECLARANDO A VARIAVEL
        edtemail = findViewById(R.id.email);
        edtsenha = findViewById(R.id.senha);

        Btn_cadastrar=findViewById(R.id.bt_cadastrar);
        mAuth=FirebaseAuth.getInstance();
        Btn_logar=findViewById(R.id.btn_logar);
        //CASO O BOTAO SEJA CLICADO
        Btn_logar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                if (edtemail.getText().toString().isEmpty() || edtsenha.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "EXISTEM CAMPOS EM BRANCOS", Toast.LENGTH_SHORT).show();
                }
                else {
                    //METODO PARA RECEBER AS INFORMAÇOES DO BANCO DE DADOS
                    receberinfo();
                    //METODO PARA VER SE A SENHA E O EMAIL REALMENTE ESTAO CADASTRADOS, E REALIZAR OS PROXIMOS PASSOS
                    logar();
                }
            }
        });
        //METODO PARA IR PARA A TELA DE CADASTRO
        Btn_cadastrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                irparateladecadastro();
            }
        });
    }

    private void logar() {
        mAuth.signInWithEmailAndPassword(User.getEmail(), User.getSenha())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            //IR PARA A TELA A TELA INICIAL
                            irparatelainicial();

                        } else {
                            //EXIBIR MENSAGEM
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    private void receberinfo() {
        User = new Usuario();
        User.setEmail(edtemail.getText().toString());
        User.setSenha(edtsenha.getText().toString());
    }

    private void irparateladecadastro() {
        startActivity(new Intent(this, Cadastro.class));
    }

    //METODO QUE LEVA PARA A TELA INICIAL
    private void irparatelainicial() {
        startActivity(new Intent(this, inicial.class));
    }
}