package com.meli;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {´

    public static void main(String[] args) {

        List<Veiculo>veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Fiesta","Ford",1000));
        veiculos.add(new Veiculo("Focus","Ford",1200));
        veiculos.add(new Veiculo("Explorer","Ford",2500));
        veiculos.add(new Veiculo("Uno","Fiat",500));
        veiculos.add(new Veiculo("Cronos","Fiat",1000));
        veiculos.add(new Veiculo("Torino","Fiat",1250));
        veiculos.add(new Veiculo("Aveo","Chevrolet",1250));
        veiculos.add(new Veiculo("Spin","Chevrolet",2500));
        veiculos.add(new Veiculo("Corola","Toyota", 1200));
        veiculos.add(new Veiculo("Fortuner","Toyota",3000));
        veiculos.add(new Veiculo("Logan","Renault",950));

        //veiculos.stream().sorted((v,nv)->v.getCusto()>nv.getCusto()?1:-1).forEach(System.out::println); //ordena por custo menor - maior

        veiculos.stream().sorted(Comparator.comparing(Veiculo::getCusto)).sorted((v,nv)->v.getMarca().compareTo(nv.getMarca())).forEach(System.out::println);//ordena por marca maior - menor,

        //veiculos.stream().filter(v->v.getCusto()<=1000).forEach(System.out::println); //ordena custo menor 1000
        //veiculos.stream().filter(v->v.getCusto()>=1000).forEach(System.out::println); //ordena custo maior 1000

        double media = veiculos.stream().mapToDouble(Veiculo::getCusto).sum();

        System.out.println(media/veiculos.size());

        System.out.println("Custo medio dos veiculos " + media);

    }
}
