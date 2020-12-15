package com.angelina;

public class Oventilador {
    String marca;
    String cor;
    int velocidade;
    boolean ligado;

    void status(){
        System.out.println("Um ventilador " + this.marca + " cor " + this.cor);
        System.out.println("Está ligado? " + this.ligado);
    }

    void vel(){
        if(this.ligado == false){
            System.out.println("Sem velociade, Ventilador DESLIGADO!");
        }
        else{
            System.out.println("Ventilador ligado na velocicade " + this.velocidade);
        }
    }

    void liga(){
        this.ligado = true;
    }

    void desliga(){
        this.ligado = false;
    }
}
