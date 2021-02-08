package com.angelina.reptil;

public class Tartaruga extends Reptil{
    public Tartaruga(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover(){
        System.out.println("Anda bem devagar");
    }
}
