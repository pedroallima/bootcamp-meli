package com.dh.meli;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantVeiculosPermitidos;

    private List<Veiculo> veiculoList;

    private SocorristaCarro socorristaCarro;


    public Corrida(double distancia, double premioEmDolares, String nome, int quantVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantVeiculosPermitidos = quantVeiculosPermitidos;

        this.socorristaCarro = new SocorristaCarro();
        this.veiculoList  = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro){
        if(quantVeiculosPermitidos>veiculoList.size()){
            if(!veiculoList.contains(carro)) {
                veiculoList.add(carro);
            System.out.println("Adicionado o carro de " + carro.getPlaca());
            }else{
                System.out.println(carro.getPlaca() + " CARRO JÁ INSCRITO");
            }
        }else {
            System.out.println("CORRIDA LOTADA. "+ carro.getPlaca() + " NÃO PODE SER INSCRITO\n");
        }
    }


    //Remover veiculo recebendo objeto
    public void removeVeiculo(Veiculo veiculo){
        if(veiculoList.remove(veiculo)){
            System.out.println("VEÍCULO de "+veiculo.getPlaca() + " REMOVIDO\n");
        }else {
            System.out.println("VEÍCULO NÃO ESTAVA NA CORRIDA");
        }
    }

    //Remover carro a partir de uma determinada placa
    public void removeVeiculoPorPlaca(String placa){
        for(Veiculo veiculo: veiculoList){
            if (veiculo.getPlaca().equals(placa)){
                veiculoList.remove(veiculo);
                System.out.println("VEÍCULO de "+veiculo.getPlaca() + " REMOVIDO");
                return;
            }
        }
        System.out.println("VEÍCULO NÃO ESTAVA NA CORRIDA");
    }

    //Método para retornar o veículo  vencedor da corrida.
    public Veiculo vencedorCorrida(){
            Veiculo vencedor = null;
        if(!veiculoList.isEmpty()) {
            double melhorDesempenho=0;
            for (Veiculo veiculo : veiculoList) {
                if(melhorDesempenho< desempenhoCorrida(veiculo)){
                    melhorDesempenho= desempenhoCorrida(veiculo);
                    vencedor=veiculo;
                }
            }
        }
            return vencedor;
    }

    //Metodo para calcular o desempenho na corrida de cada veículo
    public double desempenhoCorrida(Veiculo veiculo){
        return veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao() /(veiculo.getAnguloDeVirada() * (veiculo.getPeso() - veiculo.getQuantRodas() * 100));
    }

    //Metodo para socorrer um carro
    public void socorrerCarro(String placa){
        for(Veiculo veiculo: veiculoList){
            if(veiculo.getPlaca().equals(placa)&&(veiculo instanceof Carro)){
                socorristaCarro.socorrer((Carro) veiculo);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }

    public void mostrarVeiculosDaCorrida(){
        System.out.println("*******VEÍCULOS INSCRITOS***********");
        for(Veiculo v: veiculoList) {
            System.out.println(v.getPlaca());
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantVeiculosPermitidos() {
        return quantVeiculosPermitidos;
    }
}
