package com.meli.pedro;

import com.meli.repository.EnderecoInterface;

public class Funcionario extends Pessoa implements EnderecoInterface {
    public String matricula;

    public Funcionario(String nome, String sobrenome, String cpf, int idade, String matricula) {
        super(nome, sobrenome, cpf, idade);
        this.matricula = matricula;
    }

    @Override
    public void logradouro() {
        System.out.println("Logradouro do funcionário");
    }

    @Override
    public void bairro() {
        System.out.println("Logradouro do funcionário");
    }

    @Override
    public void cidade() {
        System.out.println("Cidade do funcionário");
    }

    @Override
    public void estado() {
        System.out.println("Logradouro do funcionário");
    }

    @Override
    public void cep() {
        System.out.println("CEP do funcionário");
    }
}
