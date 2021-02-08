package com.angelina;

import java.beans.PersistenceDelegate;

public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Marcia", 16, "F");
        Professor p2 = new Professor("Thiago", 40, "M");
        Funcionario p3 = new Funcionario("Sabrina", 26, "F");
        Bolsista p4 = new Bolsista("Ellen", 15, "F");
        Visitante p5 = new Visitante("Mario", 19, "M");

        p1.setCurso("Informatica");
        p1.setMatricula(2578);

        p2.setEspecialidade("Java");
        p2.setSalario(2560.00f);

        p3.setSetor("Secretaria");
        p3.setTrabalhando(true);

        p4.setBolsa(45);
        p4.setCurso("Ingles");
        p4.setMatricula(3456);

        System.out.println(p1.detalhesP() + p1.detalhesA());
        System.out.println(p2.detalhesP() + p2.detalhesPr());
        System.out.println(p3.detalhesP() + p3.detalhesF());
        System.out.println(p4.detalhesP() + p4.detalhesA() + p4.detalhesB());
        System.out.println(p5.detalhesP());

    }
}
