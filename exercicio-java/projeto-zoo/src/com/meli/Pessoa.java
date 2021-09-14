package com.meli;

public class Pessoa {
    public String cpf;
    public String nome;
    public String sobrenome;
    public String dataNascimento;

    // ● Cadastrar pacientes;
    public Pessoa(String cpf, String nome, String sobrenome, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }
}
