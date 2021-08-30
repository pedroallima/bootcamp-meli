package com.meli.pedro;

import com.meli.repository.DisciplinasInterface;

public class Professor extends Pessoa implements DisciplinasInterface {
    public Professor(String nome, String sobrenome, String cpf, int idade) {
        super(nome, sobrenome, cpf, idade);
    }

    @Override
    public void disciplina() {
        System.out.println("Disciplina: Disciplina lecionada pelo professor");
    }

    @Override
    public void horario() {
        System.out.println("Horário: Horário da aula lecionada pelo professor");
    }

    public void imprimeDadosDoProfessor() {
        System.out.println("--- Dados do professor ---");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        disciplina();
        horario();
    }
}
