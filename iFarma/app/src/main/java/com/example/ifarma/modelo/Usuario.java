package com.example.ifarma.modelo;

public class Usuario {
    //DEFININDO O TIPO DAS VARIAVEIS,
    //E AS VARIAVEIS QUE VAO ENTRAR NO BANCO  DE DADOS

    private String id;
    private String email;
    private String senha;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void salvardados() {
    }
}
