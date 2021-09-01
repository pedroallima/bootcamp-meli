package com.meli;

import com.meli.Interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal {
/*
Animais Domésticos e
Animais de Fazenda
, atendem
cães ok, gatos ok, porquinhos-da-índia ok, coelhos ok, tartarugas ok, cavalos ok, vacas ok e ovelhas.
*/
    public int numeroPaciente;
    public String especie;
    public String racas;
    public String cor;
    public String dataNascimento;
    public String nome;

    public Animal(int numeroPaciente, String especie, String racas, String cor, String dataNascimento, String nome) {
        this.numeroPaciente = numeroPaciente;
        this.especie = especie;
        this.racas = racas;
        this.cor = cor;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }


    @Override
    public void numeroPaciente() {
        System.out.println("Numero do paciente: "+this.numeroPaciente);
    }

    @Override
    public void especie() {
        System.out.println("Especie: "+this.especie);
    }

    @Override
    public void raca() {
        System.out.println("Raca: "+this.racas);
    }

    @Override
    public void cor() {
        System.out.println("Raca: "+this.cor);
    }

    @Override
    public void dataNascimento() {
        System.out.println("Raca: "+this.dataNascimento);
    }

    @Override
    public void nome() {
        System.out.println("Raca: "+this.nome);

    }

/*Ao mesmo tempo, cada paciente tem um proprietário atribuído que deve ser conhecido:
* - ID,
- nome,
- sobrenome,
- data_de_nascimento,
- endereço e
- telefone_contato.
* */



}
