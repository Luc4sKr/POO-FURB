package com.aula.questao1.models;

/**
 *
 * @author kroix
 */
public class Circulo extends Figura {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
