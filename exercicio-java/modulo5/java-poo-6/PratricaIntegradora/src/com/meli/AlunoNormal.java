package com.meli;

public class AlunoNormal extends Pessoa implements AlunoInterface {

    public AlunoNormal(String nome, int idade, String turma) {
        super(nome, idade);
        this._turma = turma;
    }

    private String _turma;

    @Override
    public void Estudar() {
        System.out.println("Estou estudando");
    }

    @Override
    public String InformarFuncaoNaUniversidade() {
        return "Eu só estudo!";
    }

    @Override
    public String getTurma() {
        return this._turma;
    }

}
