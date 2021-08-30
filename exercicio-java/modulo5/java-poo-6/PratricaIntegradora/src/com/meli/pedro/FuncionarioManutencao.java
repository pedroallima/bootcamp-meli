package com.meli.pedro;

import com.meli.repository.ServicosManutencaoInterface;

public class FuncionarioManutencao extends Funcionario implements ServicosManutencaoInterface {
    public FuncionarioManutencao(String nome, String sobrenome, String cpf, int idade, String matricula) {
        super(nome, sobrenome, cpf, idade, matricula);
    }

    @Override
    public void limpeza() {
        System.out.println("Funcionário da manutenção limpa o chão");
    }

    @Override
    public void reparoEletrico() {
        System.out.println("Funcionário da manutenção faz reparo elétrico");
    }

    @Override
    public void reparoTubulacao() {
        System.out.println("Funcionário da manutenção  repara a tubulação");
    }

    @Override
    public void jardinagem() {
        System.out.println("Funcionário da manutenção cuida do jardim");
    }

    public void imprimeDadosDoFuncionarioManutencao() {
        System.out.println("--- Dados do funcionário(a) da manutenção ---");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matrícula: " + this.matricula);
        limpeza();
        reparoEletrico();
        reparoEletrico();
        jardinagem();
    }
}
