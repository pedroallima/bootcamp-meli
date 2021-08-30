package com.meli;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String InformarFuncaoNaUniversidade() {
        return "Sou funcionario genérico na universidade";
    }

}