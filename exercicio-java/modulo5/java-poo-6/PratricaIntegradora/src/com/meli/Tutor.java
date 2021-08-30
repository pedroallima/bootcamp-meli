package com.meli;

public class Tutor  extends Pessoa implements AlunoInterface {

    public Tutor(String nome, int idade, String turma) {
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
        return "Eu estudo e ensino algumas materias para outros alunos!";
    }

    @Override
    public String getTurma() {
        return this._turma;
    }

}
