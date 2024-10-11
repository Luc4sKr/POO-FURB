package com.aula.models;

import com.aula.interfaces.IPayable;

/**
 *
 * @author kroix
 */
public abstract class Investiment implements IPayable {
    protected double balance;

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
