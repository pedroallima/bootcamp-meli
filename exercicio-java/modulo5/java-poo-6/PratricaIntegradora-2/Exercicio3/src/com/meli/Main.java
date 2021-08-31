package com.meli;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Au Auuuuuuuuuuuuu");
        cachorro.emitirSom();
        cachorro.comerMeat();
        cachorro.comerAnimal();

        System.out.println("-------------------------------------------");

        Gato gato = new Gato("Miauuu");
        gato.emitirSom();
        gato.comerMeat();
        gato.comerAnimal();

        System.out.println("-------------------------------------------");

        Vaca vaca =  new Vaca("MUUUUUUUUUUU");
        vaca.emitirSom();
        vaca.comerHerb();
        vaca.comerAnimal();

    }

}
