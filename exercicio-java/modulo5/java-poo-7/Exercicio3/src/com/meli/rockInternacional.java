package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class rockInternacional extends Musica implements IntefaceMusica{
    public rockInternacional(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarAudio() {
        System.out.println("Rock Internacional: ○ Conecte-se com eletrônicos na mesa de som");
    }

    public static void gerenciarLuzes() {
        System.out.println("Rock Internacional: nao mexe nas luzes");
    }

    /*
● Rock internacional
    ○ Conecte-se com eletrônicos (OK)
    *
    * */

    @Override
    public String toString() {
        return "rockInternacional{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
