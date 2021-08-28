package com.meli;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    float Distancia;
    float PremioEmDolares;
    String Nome;
    int QuantidadeDeVeiculosPermitidos;
    // para utilizar soccorista
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;
    private List<Veiculo> corredores;

    // criacao da corrida ok
    public Corrida(float distancia, float premioEmDolares, String nome, int quantidadeDeVeiculosPermitidos) {
        this.Distancia = distancia;
        this.PremioEmDolares = premioEmDolares;
        this.Nome = nome;
        this.QuantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
        // iniciando as classes e collections aqui no metodo construtor
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
        this.corredores  = new ArrayList<>();

    }

    public boolean isListaCheia() {
        if (corredores.size() == QuantidadeDeVeiculosPermitidos) {
            return true;
        }
        return false;
    }

   public void adicionarCarro(Veiculo carro){
       // quantidade menor que o valor da corrida
       if (isListaCheia()) {
           System.out.println("Limite maximo de inscritos!");
           return;
       }
          corredores.add(carro);
          System.out.println("Carro Adicionadas na corrida!");

   }

    public void adicionarMoto(Veiculo moto){
        // quantidade menor que o valor da corrida
        if (isListaCheia()) {
            System.out.println("Limite maximo de inscritos!");
            return;
        }
            corredores.add(moto);
            System.out.println("Carro Adicionadas na corrida!");

    }

    public void removerVeiculo(String veiculo) {
        for (int i = 0; i < corredores.size(); i++){
            if(corredores.get(i).placa == veiculo){
                corredores.remove(veiculo);
            }
            System.out.println("Veiculo removido do Modelo " + veiculo);
        }
    }

    public void removeVeiculoComPlaca(String umaPlaca){
        for (int i = 0; i < corredores.size(); i++){
            if(corredores.get(i).placa == umaPlaca){
                corredores.remove(umaPlaca);
            }
            System.out.println("Veiculo removido, Placa " + umaPlaca);
        }
    }


    public double calculaVencedor() {
        double valorMaximo = 0.0;
            for (int i = 0; i < corredores.size(); i++) {
            double resultado = corredores.get(i).velocidade * (corredores.get(i).aceleracao) + (corredores.get(i).anguloDeVirada) * (corredores.get(i).anguloDeVirada * (corredores.get(i).peso - corredores.get(i).rodas * 100));

            if (resultado > valorMaximo) {
                valorMaximo = resultado;
            }
        }
        return valorMaximo;
    }


    public void socorrerCarro(String placa) {
        for (int i = 0; i < corredores.size(); i++) {
            if(corredores.get(i).placa.equals(placa)&&(corredores instanceof Carro)){
                socorristaCarro.socorrer((Carro) corredores);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }

    public void socorrerMoto(String placa) {
        for (int i = 0; i < corredores.size(); i++) {
            if(corredores.get(i).placa.equals(placa)&&(corredores instanceof Moto)){
                socorristaMoto.socorrer((Carro) corredores);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }


    public void mostrarVeiculosDaCorrida(){
        System.out.println("*******VEÍCULOS INSCRITOS***********");
        for (int i = 0; i < corredores.size(); i++) {
            System.out.println(corredores.get(i).placa);
        }
    }




}
