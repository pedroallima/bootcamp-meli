package com.meli;

import com.meli.Interfaces.ComerMeat;

public class ovelha extends Animal implements ComerMeat{
    private String som;

    public ovelha(String som) {
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
        System.out.println("Cachorro é carnívoro!");
    }
}