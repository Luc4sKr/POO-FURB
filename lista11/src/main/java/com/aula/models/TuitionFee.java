package com.aula.models;

import com.aula.interfaces.IPayable;

/**
 *
 * @author kroix
 */
public class TuitionFee implements IPayable {
    private int nCredits;
    private double priceCredit;

    public TuitionFee(int nCredits, double priceCredit) {
        this.nCredits = nCredits;
        this.priceCredit = priceCredit;
    }
    
    @Override
    public double calculateAmountToPay() {
        return nCredits * priceCredit;
    }

    public int getnCredits() {
        return nCredits;
    }

    public void setnCredits(int nCredits) {
        this.nCredits = nCredits;
    }

    public double getPriceCredit() {
        return priceCredit;
    }

    public void setPriceCredit(double priceCredit) {
        this.priceCredit = priceCredit;
    }
}
