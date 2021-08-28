package com.meli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Veiculo> veiculo = new ArrayList<>();
        // HashMap<Integer, Veiculo> veiculo = new HashMap<>();
        Corrida corrida = new Corrida(1000,10000,"Bagaceira",20);

        veiculo.add( new Carro("Caqrro1", "H8PE311", 100, 3.6, 23.7));
        veiculo.add( new Moto("Moto1", "S23RT11", 125, 4.7, 29.5));
        veiculo.add( new Moto("Moto2", "S23RT12", 115, 4.7, 29.5));
        veiculo.add( new Moto("Moto3", "S23RT123", 65, 4.7, 29.5));
        veiculo.add( new Moto("Moto4", "S23RT134", 195, 4.7, 29.5));
        veiculo.add( new Carro("Carro2", "S23RT133R", 165, 4.7, 29.5));
        veiculo.add( new Carro("Carro3", "S23RT133", 185, 4.7, 29.5));

        // adicionando moto e carros na corrida
      //  corrida.adicionarCarro(veiculo);
        //corrida.adicionarMoto(veiculo);


        // Iniciando a corrida
        System.out.println(corrida);
        System.out.println("----------------------------");

        // mMstrando Veiculos
        System.out.println(veiculo);
        System.out.println("----------------------------");

        corrida.socorrerCarro("S23RT133R");
        System.out.println("----------------------------");

        corrida.socorrerMoto("S23RT12");
        System.out.println("----------------------------");

        corrida.removerVeiculo("Caqrro1");
        System.out.println("----------------------------");

        // Calcular Vencedor
        corrida.calculaVencedor();

    }
}
