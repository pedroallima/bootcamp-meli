package com.jpianimal;

public abstract class Animal{

    public void emitirSom(Object animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("Cachorro faz: " + cachorro.getSom());
        } else if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            System.out.println("Gato faz: " + gato.getSom());
        } else if (animal instanceof Vaca) {
            Vaca vaca = (Vaca) animal;
            System.out.println("Vaca faz: " + vaca.getSom());
        }
    }

    public void comerAnimal(Object animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("Cachorro come carne.");
        } else if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            System.out.println("Gato come carne.");
        } else if (animal instanceof Vaca) {
            Vaca vaca = (Vaca) animal;
            System.out.println("Vaca come plantas.");
        }
    }

}
