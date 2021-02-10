package com.angelina;

public class Inscrito extends Pessoa {
    private String login;
    private int totalAssistido;

    public Inscrito(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Inscrito{" + super.toString() +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
