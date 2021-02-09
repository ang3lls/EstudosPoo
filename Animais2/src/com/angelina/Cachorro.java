package com.angelina;

//exemplo de polimorfismo de sobregarda

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au!");
    }

    public void Reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        }
        else if(hora > 18){
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e latir");
            emitirSom();
        }
    }

    public void Reagir(boolean dono){
        if(dono = true){
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar e Latir");
            emitirSom();
        }
    }

    public void Reagir(String frase){
        if(frase.equals("Comida")){
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar");
        }
    }
}
