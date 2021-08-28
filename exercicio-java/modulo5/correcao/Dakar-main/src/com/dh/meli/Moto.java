package com.dh.meli;

public class Moto extends Veiculo{
    private static final double PESO_MOTO = 300.0;
    private static final int QUATIDADE_RODAS = 2;

    public Moto(String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(placa, velocidade, aceleracao, anguloDeVirada, PESO_MOTO, QUATIDADE_RODAS);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
