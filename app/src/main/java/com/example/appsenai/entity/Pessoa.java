package com.example.appsenai.entity;

import java.io.Serializable;
import java.util.Random;

public class Pessoa implements Serializable {
    private long id;
    private char tipo; // Pode ser A-ALUNO - P-PROFESSOR- G-GERENCIADOR DO SISTEMA
    private String nomeComleto;
    private String email;
    private String senha;
    private String cpf;

    public void selfGenerateId(){
        Random r1 = new Random();
        this.id=  r1.nextLong();
    }

    public Pessoa(long id, char tipo, String nomeComleto, String email, String senha, String cpf) {
        this.id = id;
        this.tipo = tipo;
        this.nomeComleto = nomeComleto;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public Pessoa(char tipo, String nomeComleto, String email, String senha, String cpf) {
        this.tipo = tipo;
        this.nomeComleto = nomeComleto;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public boolean validaEmail(){
        if(this.email.contains("@") && this.email.contains(".com")
                || this.email.contains(".com.br")
                || this.email.contains(".net")
        ){
            return true;
        }
        return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNomeComleto() {
        return nomeComleto;
    }

    public void setNomeComleto(String nomeComleto) {
        this.nomeComleto = nomeComleto;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
