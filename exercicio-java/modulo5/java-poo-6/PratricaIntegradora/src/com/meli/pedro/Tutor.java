package com.meli.pedro;

import com.meli.repository.DisciplinasInterface;

public class Tutor extends Pessoa implements DisciplinasInterface {
    public Tutor(String nome, String sobrenome, String cpf, int idade) {
        super(nome, sobrenome, cpf, idade);
    }

    @Override
    public void disciplina() {
        System.out.println("Disciplina lecionada pelo tutor");
    }

    @Override
    public void horario() {
        System.out.println("Horário da aula lecionada pelor tutor");
    }

    public void imprimeDadosDoTutor() {
        System.out.println("--- Dados do tutor ---");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        disciplina();
        horario();
    }
}
