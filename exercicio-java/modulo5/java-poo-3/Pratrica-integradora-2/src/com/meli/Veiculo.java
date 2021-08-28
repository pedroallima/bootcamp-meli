package com.meli;

import java.util.List;
import java.util.ArrayList;
public class Veiculo {
    protected String tipo;
    public String marca;
    public String placa;
    public double velocidade;
    public double aceleracao;
    public double anguloDeVirada;
    public int rodas;
    public double peso;



    public Veiculo(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada, double peso, int rodas) {
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeVirada=" + anguloDeVirada +
                ", peso=" + peso +
                ", quantRodas=" + rodas +
                '}';
    }


}







