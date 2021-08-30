package com.meli;

import com.meli.pedro.*;

public class Main {
    public static void main(String[] args) {
        Professor professorJoao = new Professor("João", "Pereira", "11144422266", 54);
        Tutor tutorFabio = new Tutor("Fabio", "Silva", "22266633311", 20);
        Aluno alunaCatarina = new Aluno("Catarina", "Kolowski", "77722211144", 19, "4567", "Medicina", "2°", "Anatomia");
        FuncionarioManutencao manutencaoAline = new FuncionarioManutencao("Aline", "Alves", "99911144477", 29, "110011");
        FuncionarioSuporteTecnico suportePedro = new FuncionarioSuporteTecnico("Pedro", "Lima", "888811122255", 35, "5");

        professorJoao.imprimeDadosDoProfessor();
        tutorFabio.imprimeDadosDoTutor();
        alunaCatarina.imprimeDadosDoAluno();
        manutencaoAline.imprimeDadosDoFuncionarioManutencao();
        suportePedro.imprimeDadosDoFuncionarioSuporteTecnico();
    }
}
