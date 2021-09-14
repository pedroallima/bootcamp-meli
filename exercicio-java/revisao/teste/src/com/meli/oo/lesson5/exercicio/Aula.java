package com.meli.oo.lesson5.exercicio;

/*
************************* Exercício sobre Collections e Exceptions *************************

* * Implementar uma exceção chamada ClienteMenorIdade, lançada sempre que um cliente menor de idade for adicionado
em um ArrayList;

* * Implementar uma exceção chamada ClienteExistente, lançada sempre que um cliente já existir em um ArrayList e o
usuário tentar cadastra-lo novamenteObservação: Utilizar a Classe InputStream ou Scanner para obter dados digitados
pelo usuário no console
* */

import java.util.ArrayList;
import java.util.Iterator;

public class Aula {

    private static void iterarPorIterator(ArrayList<String> array) {
        System.out.println("\n\n\niterando por iterator");
        Iterator<String> iterator = array.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterarPorForEach(ArrayList<String> array) {
        System.out.println("\n\n\niterando por foreach");
        for(String item: array) {
            System.out.println(item);
        }
    }

    private static void iterarPorLoop(ArrayList<String> array) {
        System.out.println("\n\n\niterando por loop");
        for(int i=0; i<array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("kenyo");
        array.add("mauri");
        array.add("filipe");
        array.add("joice");

        iterarPorLoop(array);
        iterarPorForEach(array);
        iterarPorIterator(array);
    }
}


