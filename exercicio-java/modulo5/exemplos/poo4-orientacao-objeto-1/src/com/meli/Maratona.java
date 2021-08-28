package com.meli;

import java.util.HashMap;
import java.util.Map;

public class Maratona{

    //Cria 3 listas do tipo HashMap. Uma para cada circuíto
    HashMap<Integer,Pessoa> pequenoCircuito = new HashMap<>();
    HashMap<Integer,Pessoa> circuitoMedio = new HashMap<>();
    HashMap<Integer,Pessoa> grandeCircuito = new HashMap<>();
    int inscricao = 1;

    //Método para inscrever maratonista
    public void inscreveMaratonista(String categoria, Pessoa pessoa){
        switch (categoria){
            case "pequeno":
                pequenoCircuito.put(inscricao++, pessoa);
                if(pessoa.getIdade()<=18){
                    pessoa.setValorInscricao(1300.0);
                }else{
                    pessoa.setValorInscricao(1500.0);
                }
                break;
            case "médio":
                circuitoMedio.put(inscricao++, pessoa);
                if(pessoa.getIdade()<=18){
                    pessoa.setValorInscricao(2000.0);
                }else{
                    pessoa.setValorInscricao(2300.0);
                }
                break;
            case "grande":
                grandeCircuito.put(inscricao++, pessoa);
                if(pessoa.getIdade()<=18){
                    pessoa.setValorInscricao(0); // depois retirar
                }else{
                    pessoa.setValorInscricao(2300.0);
                }
                break;
        }

    }

    //Método para mostrar inscrições por categoria
    public void mostraListaPorCategoria(String categoria){
        switch (categoria){
            case "pequeno":
                System.out.println("***********CATEGORIA PEQUENO CIRCUÍTO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry: pequenoCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                break;
            case "médio":
                System.out.println("***********CATEGORIA CIRCUÍTO MÉDIO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry: circuitoMedio.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                break;
            case "grande":
                System.out.println("***********CATEGORIA CIRCUÍTO AVANCADO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry: grandeCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                break;
        }
    }

    //Metodo para cancelar inscrição
    public void cancelaInscricao(String categoria, int numeroInscricao){
        switch (categoria){
            case "pequeno":
                pequenoCircuito.remove(numeroInscricao);
                break;
            case "médio":
                circuitoMedio.remove(numeroInscricao);
                break;
            case "grande":
                grandeCircuito.remove(numeroInscricao);
                break;
        }
    }

}