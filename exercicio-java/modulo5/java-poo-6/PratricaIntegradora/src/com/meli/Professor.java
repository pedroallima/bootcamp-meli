package com.meli;


public class Professor extends Pessoa {

    public Professor(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String InformarFuncaoNaUniversidade() {
        return "Sou professor e ensino os alunos da universidade";
    }
}