package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class Sertanejo extends Musica implements IntefaceMusica {


    public Sertanejo(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarAudio() {
        System.out.println("na musica Sertaneja, Nao pode mexer no audio");
    }

    public static void gerenciarLuzes() {
        System.out.println("Para Musica sertaneja, ○ Coloque luzes verdes, amarelas e azuis");
    }

    /*
    *
● Sertanejo / Brasileiro
    ○ Coloque luzes verdes, amarelas e azuis (ok)
    * */

    @Override
    public String toString() {
        return "Sertanejo{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
