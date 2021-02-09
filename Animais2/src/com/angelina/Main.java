package com.angelina;

public class Main {
    public static void main(String[] args){
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        l.emitirSom();

        c.Reagir(true);
        c.Reagir("Comida");
        c.Reagir(14,00);
    }
}
