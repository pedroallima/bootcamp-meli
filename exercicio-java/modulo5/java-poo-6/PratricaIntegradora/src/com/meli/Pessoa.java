package com.meli;

public abstract class Pessoa {
    private String _nome;
    private int _idade;

    public Pessoa(String nome, int idade){
        this._nome = nome;
        this._idade = idade;
    }

    public String getNome(){
        return this._nome;
    }

    public int getIdade(){
        return this._idade;
    }

    public abstract String InformarFuncaoNaUniversidade();
}
