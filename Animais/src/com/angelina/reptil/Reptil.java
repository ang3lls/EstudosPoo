package com.angelina.reptil;

import com.angelina.Animal;

public class Reptil extends Animal {
    private String corEscama;

    public Reptil(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vejetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
