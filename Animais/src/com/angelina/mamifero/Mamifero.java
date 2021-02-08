package com.angelina.mamifero;

import com.angelina.Animal;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover(){
        System.out.println("Corrrendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
