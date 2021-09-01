package com.meli;


public class Paciente extends Animal{
    public int id;
    public String sobrenome;
    public String dataDeNascimento;
    public String endereco;
    public String telefoneContato;


    public Paciente(int numeroPaciente, String especie, String racas, String cor, String dataNascimento, String nome, int id, String sobrenome, String dataDeNascimento, String endereco, String telefoneContato) {
        super(numeroPaciente, especie, racas, cor, dataNascimento, nome);
        this.id = id;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", endereco='" + endereco + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
