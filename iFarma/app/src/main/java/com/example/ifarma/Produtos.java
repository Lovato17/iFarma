package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Produtos extends AppCompatActivity {
    private Button btnAdd;
    private CheckBox checkBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        btnAdd=findViewById(R.id.btnadd);
        //CASO O BOTAO SEJA CLICADO

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
            }
        });
    }
}