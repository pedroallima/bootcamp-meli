package com.meli;

public class PessoalManutencao extends Pessoa {

    public PessoalManutencao(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String InformarFuncaoNaUniversidade() {
        return "Sou da manutenção e conserto problemas estruturais da universidade";
    }

}
