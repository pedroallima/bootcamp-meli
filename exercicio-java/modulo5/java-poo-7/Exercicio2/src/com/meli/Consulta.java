package com.meli;

import com.meli.Interfaces.InterfaceConsulta;
import java.util.ArrayList;
import java.util.List;

public class Consulta<E> implements InterfaceConsulta {
    public String rg;
    public String nome; // do medico
    public String sobrenome;
    public String numeroRegistro;
    public String especialista;
    public String medico;
    private List<E> Animais = new ArrayList<>();

    public Consulta(String rg, String nome, String sobrenome, String numeroRegistro, String especialista, String medico, List<E> animais) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroRegistro = numeroRegistro;
        this.especialista = especialista;
        this.medico = medico;
        Animais = animais;
    }

    public void colocarPaciente(E e){
        Animais.add(e);
    }

    public E retirarPaciente(){
        return  Animais.get(0);
    }


    @Override
    public void data() {
        System.out.println("A data da consulta");
    }

    @Override
    public void motivo() {
        System.out.println("Motivo da Consulta");
    }

    @Override
    public void diagnostico() {
        System.out.println("Diagnostico");
    }

    @Override
    public void tratamento() {
        System.out.println("o Tratamento");
    }


    /*
● Por outro lado, cada consulta deve ter também um médico veterinário
responsável do qual ficam armazenados:
- RG,
- nome,
- sobrenome,
- número de registro e
- especialidade.
* */


}
