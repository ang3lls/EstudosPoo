package com.angelina;
//herança para diferença

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void cancelarMatri(){
        System.out.println("Matricula cancelada");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String detalhesA() {
        return " Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
