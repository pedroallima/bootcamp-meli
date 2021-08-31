package com.meli.Exercicio1;

import com.meli.Exercicio1.domain.Cliente;

public class CriarConta {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(
                "Mercado Pago",
                323,
                "0001",
                "00000000011",
                "Fulano Silva",
                "11122233344",
                1000000,
                "executivo"
                );


        fulano.imprimeDadosDoCliente("00000000011");

        fulano.deposita(500000);

        System.out.println("--- Novo saldo ---");
        fulano.saldo();

        fulano.imprimeDadosDoCliente("00000000011");

        System.out.println("");

        fulano.consultaSaldo();
        fulano.depositaNaConta();
        fulano.transfereParaOutraConta();
        fulano.pagamentoDeServicos();
        fulano.saqueDaConta();
    }
}
