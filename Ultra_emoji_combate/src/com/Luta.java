package com;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada){
        setDesafiado(desafiado);
        setDesafiante(desafiante);
        setRounds(rounds);
        setAprovada(aprovada);
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar(){
        if (aprovada){
            System.out.println("-----Desafiado-----");
            this.desafiado.apresentacao();
            System.out.println("-----Desafiante-----");
            this.desafiante.apresentacao();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("-----Resultado-----");
            switch (vencedor){
                case 0: //Empate
                    System.out.println("-----Empatou-----");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Ganhou: " + desafiado.toString());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Ganhou: " + desafiante.toString());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    @Override
    public String toString() {
        return "Luta{" +
                "desafiado=" + desafiado +
                ", desafiante=" + desafiante +
                ", rounds=" + rounds +
                ", aprovada=" + aprovada +
                '}';
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


}
