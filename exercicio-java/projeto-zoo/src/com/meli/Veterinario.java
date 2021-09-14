package com.meli;

public class Veterinario  extends Pessoa{
    // public String cpf;
   //  public String nome;
   //  public String sobrenome;
    public int numeroRegistro;
    public String especialidade;

    // ● Cadastrar médicos;
    public Veterinario(String cpf, String nome, String sobrenome, String dataNascimento, int numeroRegistro, String especialidade) {
        super(cpf, nome, sobrenome, dataNascimento);
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
    }
}
