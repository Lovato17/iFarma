package com.example.ifarma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cadastro extends AppCompatActivity {
    //DECLARANDO O TIPO E A VARIAVEL DO BOTAO
    private EditText etemail;
    private EditText etsenha;
    private Button Btn_logar;
    private Button Btn_cadastrar;
    private Button Btn_voltar;
    private FirebaseAuth mAuth;
    private Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //DECLARANDO A VARIAVEL
        etemail = findViewById(R.id.email);
        etsenha = findViewById(R.id.senha);
        Btn_logar = findViewById(R.id.btn_logar);
        Btn_cadastrar = findViewById(R.id.bt_cadastrar);
        Btn_voltar = findViewById(R.id.btn_voltar);
        mAuth = FirebaseAuth.getInstance();

        //SETANDO O CLICK DO BOTAO
        Btn_voltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //METODO PARA IR PARA A TEALA DE LOGIN
                irparateladelogin();
            }
        });

        Btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etemail.getText().toString().isEmpty() || etsenha.getText().toString().isEmpty()) {
                    Toast.makeText(Cadastro.this, "Existem campos em Braco!!!", Toast.LENGTH_SHORT).show();
                }
                //METODO PARA PEGAR AS INFORMAÇOES NO EDIT TEXT
                else{
                Pegarinfo();
                //METODO PARA SALVAR INFORMAÇOES NO BANCO DE DADOS
                login();}
            }
        });
    }

    private void irparateladelogin() {
        startActivity(new Intent(Cadastro.this, MainActivity.class));
    }

    private void login() {
        mAuth.createUserWithEmailAndPassword(user.getEmail(), user.getSenha())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Cadastro.this, "Cadastrado com Sucesso!!", Toast.LENGTH_SHORT).show();
                            FirebaseUser use = mAuth.getCurrentUser();
                            user.setId(use.getUid());
                            user.salvardados();
                            startActivity(new Intent(Cadastro.this, MainActivity.class));

                        } else {
                            Toast.makeText(Cadastro.this, "Cadastro já existente ou E-mail inválido", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    private void Pegarinfo() {
            user = new Usuario();
            user.setEmail(etemail.getText().toString());
            user.setSenha(etsenha.getText().toString());
    }
}

