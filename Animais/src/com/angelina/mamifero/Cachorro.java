package com.angelina.mamifero;

public class Cachorro extends Mamifero{
    public Cachorro(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public void enterrarOssso(){
        System.out.println("Enterrando o osso");
    }

    @Override
    public void emitirSom(){
        System.out.println("AU AU");
    }
}
