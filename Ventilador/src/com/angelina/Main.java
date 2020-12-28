package com.angelina;

public class Main {

    public static void main(String[] args) {
	    Oventilador V1 = new Oventilador();
	    V1.marca = "Philco";
	    V1.cor = "Preto";
	    V1.liga();
	    V1.status();
	    V1.vel();

		System.out.println("............................");

		Oventilador V2 = new Oventilador();
		V2.marca = "Mondial";
		V2.cor = "Prata";
		V2.desliga();
		V2.status();
		V2.vel();
    }
}
