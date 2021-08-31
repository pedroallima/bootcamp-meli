package com.meli;

import com.meli.Interfeces.IntefaceMusica;

public class reggaeton extends Musica implements IntefaceMusica{

    public reggaeton(int numeroDaMusica, String artista, String nome, int ano) {
        super(numeroDaMusica, artista, nome, ano);
    }

    public static void gerenciarAudio() {
        System.out.println("Regton: ○ Sincronize o movimento das luzes com o ritmo");
    }

    public static void gerenciarLuzes() {
        System.out.println("Regton:  ○ Anzol com cumbia");
    }
/*
    * ● Reggaeton
        ○ Sincronize o movimento das luzes com o ritmo (ok)
        ○ Anzol com cumbia (OK)
* */

    @Override
    public String toString() {
        return "reggaeton{" +
                "numeroDaMusica=" + numeroDaMusica +
                ", artista='" + artista + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                "}\n";
    }
}
