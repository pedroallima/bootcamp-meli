package com.meli;

import com.meli.zoo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        // adicionando os animais
        animais.add( new Cachorro(1,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Cavalo(2,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Coelho(3,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Gato(4,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Ovelho(5,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new PorquinhoDaIndia(6,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Tartaruga(7,"cachorro","raca1","preto","08-11-1985","Nome1"));
        animais.add( new Vaca(8,"cachorro","raca1","preto","08-11-1985","Nome1"));

        //colocando os animais na consulta
        List<Consulta> consultas = new ArrayList<>();
        consultas.add(new Consulta("909090909090","Jose","Leao","090909","Veterinario","Medico1",animais));

        // paciente nao entendi sera que e proprietario?????????
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1,"Paciente1","08-08-2020","endereco1","87878787","Paciente",1,"ete","8-11-1985","rua","87878787"));
        pacientes.add(new Paciente(2,"Paciente1","08-08-2020","endereco1","87878787","Paciente",2,"ete","8-11-1985","rua","87878787"));
        pacientes.add(new Paciente(3,"Paciente1","08-08-2020","endereco1","87878787","Paciente",3,"ete","8-11-1985","rua","87878787"));
        pacientes.add(new Paciente(4,"Paciente1","08-08-2020","endereco1","87878787","Paciente",4,"ete","8-11-1985","rua","87878787"));
          System.out.println(pacientes);

/*
* Solicita-se a realização da modelagem de cada uma dessas classes, levando em
consideração suas relações e a interação entre cada uma delas. Implementar (na classe
correspondente) os métodos necessários para:

● Criar uma nova consulta
● Ver a lista de todos os pacientes registrados junto com seus proprietários
● Ver a lista de todas as consultas atribuídas a um determinado paciente
● Qualquer outro método que possa contribuir para o referido ou outras
funcionalidades que possam coincidir com o cenário proposto.
*/

    }
}
