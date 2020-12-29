package com.angelina;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0d);
        this.setStatus(false);
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50d);
        }
        else if(tipo == "CP"){
            this.setSaldo(150d);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double v){
        if(this.getStatus() == true){
            setSaldo(getSaldo() + v);
            System.out.println("Saldo depositado com sucesso " + getDono());
        }
        else{
            System.out.println("Impossivel depositar em conta fechada");
        }
    }

    public void sacar(double v){
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realixado na conta de " + getDono());
            }
            else{
                System.out.println("Saldo insuficiente para sacar");
            }
        }
        else{
            System.out.println("Impossivel sacar dessa conta");
        }
    }

    public void pagarMensal(){
        double v = 0;
        if(getTipo() == "CC"){
            v = 12;
        }
        else if(getTipo() == "CP"){
            v = 20;
        }
        if(getStatus() == true) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else if (getSaldo() < v) {
                System.out.println("Saldo insuficiente");
            }
        }
        else if(getStatus() == false){
            System.out.println("impossivel fazer essse pagamento, conta ão existe mais");
        }
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}

