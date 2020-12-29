package com.angelina;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void ControleRemoto(){
        setVolume(20);
        setTocando(false);
        setLigado(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        if(this.getLigado() == true){
            System.out.println("----MENU----");
            System.out.println("Ligado: " + getLigado());
            System.out.println("Volume: " + getVolume());
            System.out.println("Play: " + getTocando());
        }
    }

    @Override
    public void fecharMenu(){
        if(this.getLigado() == true){
            System.out.println("FECHANDO MENU...");
        }
    }

    @Override
    public void maisVolume(){
        if(getLigado() == true){
            setVolume(getVolume() + 1);
        }
        System.out.println("Volume: " + getVolume());
    }

    @Override
    public void menosVolume(){
        if(getLigado() == true) {
            setVolume(getVolume() - 1);
        }
        System.out.println("Volume: " + getVolume());
    }

    @Override
    public void ligarMudo(){
        if(getLigado() == true){
            if(getVolume() > 0)
                setVolume(0);
        }
        System.out.println("MUDO!");
    }

    @Override
    public void desligarMudo(){
        if(getLigado() == true){
            if(getVolume() == 0){
                setVolume(20);
            }
        }
        System.out.println("MUDO DESLIGADO!");
        System.out.println("Volume: " + getVolume());
    }

    @Override
    public void play(){
        if(getLigado() == true && getTocando() == false){
            setTocando(true);
        }
        System.out.println("Tocando...");
    }

    @Override
    public void pause(){
        if(getLigado() == true && getTocando() == true){
            setTocando(false);
        }
        System.out.println("Pausado...");
    }
}
