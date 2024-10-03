/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula.models;

/**
 *
 * @author kroix
 */
public class ContaEspecial {
    private double limiteCredito;

    public ContaEspecial(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
