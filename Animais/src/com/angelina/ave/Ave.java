package com.angelina.ave;

import com.angelina.Animal;

public class Ave extends Animal {
    private String corPena;

    public Ave(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
