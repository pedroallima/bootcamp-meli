package com.meli;

public class Carro extends Veiculo {
    private static final double PESO_CARRO = 1000.00;
    private static final int QUATIDADE_RODAS = 4;

    public Carro(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada, PESO_CARRO, QUATIDADE_RODAS);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

