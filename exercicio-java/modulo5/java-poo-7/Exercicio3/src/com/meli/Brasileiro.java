package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class Brasileiro extends Musica implements IntefaceMusica {

    public Brasileiro(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarLuzes() {
        System.out.println("Para Musica Brasilheira, Coloque luzes verdes, amarelas e azuis");
    }

    /*
● Sertanejo / Brasileiro
    ○ Coloque luzes verdes, amarelas e azuis (OK)
    * */

    @Override
    public String toString() {
        return "Brasileiro{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
