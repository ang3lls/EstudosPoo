package com.angelina.peixe;

import com.angelina.Animal;

public class Peixe extends Animal {
    private String corEscama;

    public Peixe(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
