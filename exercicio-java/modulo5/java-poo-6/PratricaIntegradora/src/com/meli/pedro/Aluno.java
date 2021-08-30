package com.meli.pedro;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private String periodo;
    private String disciplina;

    public Aluno(String nome, String sobrenome, String cpf, int idade, String matricula, String curso, String periodo, String disciplina) {
        super(nome, sobrenome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.disciplina = disciplina;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void imprimeDadosDoAluno() {
        System.out.println("--- Dados do aluno(a) ---");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Período: " + this.getPeriodo());
        System.out.println("Disciplina: " + this.getDisciplina());
    }
}
