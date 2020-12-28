package com.angelina;

public class Quadros {
    public String cor;
    public float largura;
    public float comprimento;
    public boolean vendido;

    public Quadros(String m, float l, float c) {
        this.setModelo(m);
        this.setLargura(l);
        this.setComprimento(c);
        this.vender();
    }

    public String getModelo() {
        return this.cor;
    }

    public void setModelo(String m) {
        this.cor = m;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float l) {
        this.largura =l;
    }

    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float c) {
        this.comprimento = c;
    }
    public void vender(){
        this.vendido = true;
    }

    public void status() {
        System.out.println("SOBRE O QUADRO:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tamanho: " + this.getLargura() + " por " + this.getComprimento() + " cm");
    }
}
