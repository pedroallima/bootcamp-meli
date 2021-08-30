package com.meli;

public class AlunoTecnico  extends Pessoa implements AlunoInterface {

    public AlunoTecnico(String nome, int idade, String turma) {
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
        return "Eu estudo e ajudo no suporte técnico!";
    }

    @Override
    public String getTurma() {
        return this._turma;
    }

}
