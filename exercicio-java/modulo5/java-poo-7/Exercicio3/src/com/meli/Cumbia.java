package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class Cumbia extends Musica implements IntefaceMusica  {
    public Cumbia(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarAudio() {
        System.out.println("Cunbia: ○ Hook com reggaeton");
    }

    public static void gerenciarLuzes() {
        System.out.println("Conbia: ○ Hook com reggaeton");
    }

    /*
● Cumbia
○ Hook com reggaeton (ok)
    * */
    @Override
    public String toString() {
        return "Cumbia{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
