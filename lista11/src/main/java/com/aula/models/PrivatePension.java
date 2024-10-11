package com.aula.models;

/**
 *
 * @author kroix
 */
public class PrivatePension extends Investiment {
    private double value;

    public PrivatePension(double value) {
        this.value = value;
    }
    
    @Override
    public double calculateAmountToPay() {
        return this.value * this.getBalance();
    }
    
    public void invest() {
        
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
