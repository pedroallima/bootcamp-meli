package com.dh.meli;

public abstract class Veiculo {
    private String placa;
    private double velocidade;
    private double aceleracao;
    private double anguloDeVirada;
    private double peso;
    private int quantRodas;

    public Veiculo(String placa, double velocidade, double aceleracao, double anguloDeVirada, double peso, int quantRodas) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.peso = peso;
        this.quantRodas = quantRodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeVirada=" + anguloDeVirada +
                ", peso=" + peso +
                ", quantRodas=" + quantRodas +
                '}';
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantRodas() {
        return quantRodas;
    }
}
