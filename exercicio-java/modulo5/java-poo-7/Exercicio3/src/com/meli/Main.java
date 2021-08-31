package com.meli;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
* Levando em consideração as funcionalidades comuns e particulares, desenvolva a classe
necessária, interface ou modelagem de classe abstrata.


inclua-os em uma lista chamada Playlist.
* Uma vez que a Playlist é criada, percorra a lista de músicas uma a uma e invoque os métodos
correspondentes de acordo com o gênero.
 */
        List<Musica> genero = new ArrayList<>();

        genero.add( new Brasileiro(10,"Caetano Veloso","pedro",1985));
        genero.add( new Cumbia(11,"CUMBIA Veloso","pedro",1985));
        genero.add( new Eletrônico(12,"ELETRONICO Veloso","pedro",1985));
        genero.add( new reggaeton(13,"REGGE Veloso","pedro",1985));
        genero.add( new rockInternacional(14,"Rock Veloso","pedro",1985));
        genero.add( new Sertanejo(15,"Sertanejo","pedro",1985));


        System.out.println(genero);


        Musica.gerenciarAudio();
        Brasileiro.gerenciarLuzes();
        Cumbia.gerenciarAudio();
        Cumbia.gerenciarLuzes();
        Eletrônico.gerenciarAudio();
        Eletrônico.gerenciarLuzes();
        reggaeton.gerenciarAudio();
        reggaeton.gerenciarLuzes();
        rockInternacional.gerenciarAudio();
        rockInternacional.gerenciarLuzes();
        Sertanejo.gerenciarAudio();
        Sertanejo.gerenciarLuzes();








    }
}
