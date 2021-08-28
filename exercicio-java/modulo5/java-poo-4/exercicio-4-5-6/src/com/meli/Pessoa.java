package com.meli;

class Pessoa {
    String nome;
    int idade;
    Integer id;
    Double peso;
    Double altura;
    public Pessoa(){

    }
    public Pessoa(String nome,int idade,Integer id){
        this(nome,idade,id,null,null);
    }
    public Pessoa(String nome, int idade, Integer id, Double peso, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20){
            return -1;
        }else if(imc <=25){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean eMaiorDeIdade(){
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
