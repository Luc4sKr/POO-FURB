package com.aula.models;

import com.aula.interfaces.IPayable;

/**
 *
 * @author kroix
 */
public class WaterBill implements IPayable {
    private int metrosCubicos;
    private double precoMetroCubico;

    public WaterBill(int metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }
    
    @Override
    public double calculateAmountToPay() {
        return metrosCubicos * precoMetroCubico;
    }

    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    public void setPrecoMetroCubico(double precoMetroCubico) {
        this.precoMetroCubico = precoMetroCubico;
    }
}