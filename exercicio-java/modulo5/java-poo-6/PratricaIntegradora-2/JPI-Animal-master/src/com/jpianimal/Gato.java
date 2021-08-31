package com.jpianimal;

import com.jpianimal.Interfaces.ComerMeat;

public class Gato extends Animal implements ComerMeat {
    private String som;

    public Gato(String som) {
        this.som = som;
    }

    public void emitirSom() {
        emitirSom(this);
    }

    public void comerAnimal() {
        comerAnimal(this);
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void comerMeat() {
        System.out.println("Gato é carnívoro!");
    }
}
