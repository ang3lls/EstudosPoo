package com.angelina;

public class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void renovarBolsa(){
        System.out.println("Renovano bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " è bolsista");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public String detalhesB() {
        return " Bolsista{" +
                "bolsa=" + bolsa +
                '}';
    }
}
