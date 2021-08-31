package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class Eletrônico extends Musica implements IntefaceMusica  {

    public Eletrônico(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarAudio() {
        System.out.println("Eletronico: ○ Conecte-se com o rock internacional");
    }

    public static void gerenciarLuzes() {
        System.out.println("Eletronico:  ○ Ativar luzes laser");
    }

    /*
● eletrônica
    ○ Ativar luzes laser  (OK)
    ○ Conecte-se com o rock internacional (OK)
    * */

    public String toString() {
        return "Eletrônico{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
