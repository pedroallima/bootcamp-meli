package com.meli.pedro;
import com.meli.repository.ServicosSuporteTecnicoInterface;

public class FuncionarioSuporteTecnico extends Funcionario implements ServicosSuporteTecnicoInterface {
    public FuncionarioSuporteTecnico(String nome, String sobrenome, String cpf, int idade, String matricula) {
        super(nome, sobrenome, cpf, idade, matricula);
    }

    @Override
    public void manutencaoDeEquipamentosDeTi() {
        System.out.println("Funcionário do suporte concerta equipamentos de TI");
    }

    @Override
    public void manutencaoDeEquipamentosCientificos() {
        System.out.println("Funcionário do suporte concerta equipamentos científicos");
    }

    public void imprimeDadosDoFuncionarioSuporteTecnico() {
        System.out.println("--- Dados do funcionário(a) do suporte técnico ---");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matrícula: " + this.matricula);
        manutencaoDeEquipamentosDeTi();
        manutencaoDeEquipamentosCientificos();
    }
}
