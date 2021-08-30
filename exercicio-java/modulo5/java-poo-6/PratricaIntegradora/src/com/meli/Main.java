package com.meli;

public class Main {


   /* Suponha que queremos modelar pessoas de uma universidade para implementar um
    sistema de gerenciamento de curso.
    Existem diferentes pessoas envolvidas:
    funcionários, ok
    alunos, ok
    professores, ok
    pessoal de manutenção, ok
    tutores, ok
    pessoal de suporte técnico e ok
    alunos técnicos. ok

    Tutores e
    alunos técnicos
    são interessantes:
    Tutores são alunos que foram escolhidos para ensinar algo, e alunos técnicos são
    alunos que foram selecionados para colaborar no suporte técnico.


    Faça uma hierarquia de tipos (classes e interfaces) que representa esta situação. Jogue um
    cenário mostrando quais tipos são classes concretas, classes abstratas e interfaces.*/





    public static void main(String[] args) throws Exception {
        AlunoNormal alunoNormal = new AlunoNormal("João", 21, "Terceiro Noite");
        Tutor tutor = new Tutor("Maria", 22, "Quarto Tarde");
        AlunoTecnico alunoTecnico = new AlunoTecnico("Allison", 33, "Primeiro Manhã");

        Funcionario funcionario = new Funcionario("Cleber", 40);
        Professor professor = new Professor("Joana", 35);
        PessoalManutencao pessoalManutencao = new PessoalManutencao("Carlos", 33);
        PessoalSuporteTecnico pessoalSuporteTecnico = new PessoalSuporteTecnico("Fabio", 27);

        System.out.println("Para o exercicio foram criadas 7 Classes Concretas, 1 Classe Abstrata, 1 Interface\n");

        System.out.println("A classe abstrata criada foi a Pessoa.");
        System.out.println("O motivo para a escolha de utilizar a Pessoa como abstrata é que assim pude estabeler ");
        System.out.println("atributos padrões para todas as classes que exetenderam a Pessoa (Nome, Idade) .\n");

        System.out.println("A Interface criada foi a AlunoInterface.");
        System.out.println("O motivo para a utilização de uma Inteface foi para obrigar a utilização dos metodos ");
        System.out.println("getTurma e Estudar nas classes que implementaram a Interface\n");

        System.out.println("Utilizando o metodo abstrato InformarFuncaoNaUniversidade da classe Pessoa, foi possivel especializar ");
        System.out.println("para cada classe que extendeu Pessoa \n");

        System.out.println("As classes concretas criadas foram a AlunoNormal, Tutor, AlunoTecnico, Funcionario, Professor, PessoalManutencao, PessoalSuporteTecnico\n");

        System.out.println("Abaixo cada uma utilizando o metodo InformarFuncaoNaUniversidade, getIdade, getNome e seus metodos especificos (Estudar e getTurma)");
        System.out.println("Sou um \"Aluno Nomal\"");
        System.out.println("Meu Nome é " + alunoNormal.getNome());
        System.out.println("Tenho " + alunoNormal.getIdade() + " anos de idade");
        System.out.println("Minha turma é " + alunoNormal.getTurma());
        alunoTecnico.Estudar();
        System.out.println("E minha função na universidade é \"" + alunoNormal.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Tutor\"");
        System.out.println("Meu Nome é " + tutor.getNome());
        System.out.println("Tenho " + tutor.getIdade() + " anos de idade");
        System.out.println("Minha turma é " + tutor.getTurma());
        alunoTecnico.Estudar();
        System.out.println("E minha função na universidade é \"" + tutor.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Aluno Técnico\"");
        System.out.println("Meu Nome é " + alunoTecnico.getNome());
        System.out.println("Tenho " + alunoTecnico.getIdade() + " anos de idade");
        System.out.println("Minha turma é " + alunoTecnico.getTurma());
        alunoTecnico.Estudar();
        System.out.println("E minha função na universidade é \"" + alunoTecnico.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Funcionário\"");
        System.out.println("Meu Nome é " + funcionario.getNome());
        System.out.println("Tenho " + funcionario.getIdade() + " anos de idade");
        System.out.println("E minha função na universidade é \"" + funcionario.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Professor\"");
        System.out.println("Meu Nome é " + professor.getNome());
        System.out.println("Tenho " + professor.getIdade() + " anos de idade");
        System.out.println("E minha função na universidade é \"" + professor.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Funcionario da manutenção\"");
        System.out.println("Meu Nome é " + pessoalManutencao.getNome());
        System.out.println("Tenho " + pessoalManutencao.getIdade() + " anos de idade");
        System.out.println("E minha função na universidade é \"" + pessoalManutencao.InformarFuncaoNaUniversidade() + "\"\n");

        System.out.println("Sou um \"Funcionario do Suporte Técnico\"");
        System.out.println("Meu Nome é " + pessoalSuporteTecnico.getNome());
        System.out.println("Tenho " + pessoalSuporteTecnico.getIdade() + " anos de idade");
        System.out.println("E minha função na universidade é \"" + pessoalSuporteTecnico.InformarFuncaoNaUniversidade() + "\"\n");
    }
}
