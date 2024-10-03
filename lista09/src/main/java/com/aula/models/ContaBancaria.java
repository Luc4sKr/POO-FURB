package com.aula.models;

/**
 *
 * @author kroix
 */
public class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }
    
    public void depositar(double value) {
        
    }
    
    public void sacar(double value) {
        
    }
    
    public void transferir(ContaBancaria contaDestino, double value) {
        
    }
    
    public String getNumero() {
        return numero;
    }

    public final void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected final void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
