package com.meli;

public class PessoalSuporteTecnico extends Pessoa {

    public PessoalSuporteTecnico(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String InformarFuncaoNaUniversidade() {
        return "Sou do suporte técnico e ajudo com problemas de suporte de TI e eletronicos da universidade";
    }

}
