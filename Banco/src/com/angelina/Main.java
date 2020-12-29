package com.angelina;

public class Main {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setNumConta("1234");
        p1.setDono("Eliza");
        p1.estadoAtual();

        System.out.println("....................");

        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setNumConta("7890");
        p2.setDono("Lucas");
        p2.estadoAtual();

        p1.depositar(1000);
        p1.pagarMensal();
        p1.estadoAtual();

        System.out.println("....................");

        p2.depositar(800);
        p2.pagarMensal();
        p2.estadoAtual();




    }
}
