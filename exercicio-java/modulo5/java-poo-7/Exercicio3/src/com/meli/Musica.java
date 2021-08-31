package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class Musica implements IntefaceMusica {

    /*
    * A partir disso, crie uma série de - músicas relacionadas a cada um dos gêneros mencionados,
    levando em consideração:
    * número da música,
    * artista,
    * nome e
    * ano e
    */
    public  int numeroDaMusica;
    public  String artista;
    public  String nome;
    public  int ano;

    public Musica(int numeroDaMusica, String artista, String nome, int ano) {
        this.numeroDaMusica = numeroDaMusica;
        this.artista = artista;
        this.nome = nome;
        this.ano = ano;
    }

    public static void gerenciarAudio() {
        System.out.println("na musica Brasilheira, Nao pode mexer no audio");
    }
}
