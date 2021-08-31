package com.jpianimal;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Au Au");
        cachorro.emitirSom();
        cachorro.comerMeat();
        cachorro.comerAnimal();

        System.out.println("-------------------------------------------");

        Gato gato = new Gato("Miau");
        gato.emitirSom();
        gato.comerMeat();
        gato.comerAnimal();

        System.out.println("-------------------------------------------");

        Vaca vaca =  new Vaca("MUUU");
        vaca.emitirSom();
        vaca.comerHerb();
        vaca.comerAnimal();

    }

}
