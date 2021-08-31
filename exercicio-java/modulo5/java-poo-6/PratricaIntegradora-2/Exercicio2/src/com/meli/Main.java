package com.meli;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> habilidades = new ArrayList<>();
        habilidades.add("Programadora Java");
        habilidades.add("Fluente em Espanhol");
        habilidades.add("Programadora Front-end");

        Curriculo curriculo = new Curriculo("Pedro Augusto", "35", new Endereco("Rua cerejeira", 160, "56310-000"), habilidades);
        curriculo.imprimir();

        Relatorio relatorio = new Relatorio(30, 600, "José Alberto", "Felipe");
        relatorio.imprimir();

        LivroPdf livro = new LivroPdf(30, "Thiagp ", "Flores Negra", "Jornal");
        livro.imprimir();


    }
}
