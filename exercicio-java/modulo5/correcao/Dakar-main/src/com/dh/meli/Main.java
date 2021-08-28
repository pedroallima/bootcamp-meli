package com.dh.meli;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Corrida grandePremioMeli = new Corrida(56, 60000.0, "Corrida Maluca", 5);

        Carro carroJoice = new Carro("JOICE",202, 8, 45);
        Carro carroFilipe = new Carro("FILIPE",158, 8, 45);
        Carro carroThiago = new Carro("THIAGO",160, 8, 45);
        Carro carroPatricia = new Carro("PATRICIA",180, 8, 45);
        Carro carroAna = new Carro("ANA",179, 8, 45);


        grandePremioMeli.adicionarCarro(carroAna);
        grandePremioMeli.adicionarCarro(carroFilipe);
        grandePremioMeli.adicionarCarro(carroJoice);
        grandePremioMeli.adicionarCarro(carroPatricia);
        grandePremioMeli.adicionarCarro(carroThiago);


        Veiculo veiculo = grandePremioMeli.vencedorCorrida();
        System.out.println("VENCEDOR " + veiculo.getPlaca() + " LEVA "+ grandePremioMeli.getPremioEmDolares() + " dólares");

        grandePremioMeli.removeVeiculo(carroFilipe);

        grandePremioMeli.mostrarVeiculosDaCorrida();

        grandePremioMeli.removeVeiculoPorPlaca("JOICE");

        grandePremioMeli.mostrarVeiculosDaCorrida();

        grandePremioMeli.socorrerCarro("PATRICIA");


    }


}
