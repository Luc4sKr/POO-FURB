package com.aula.models;

import com.aula.interfaces.IPayable;
import java.util.ArrayList;

/**
 *
 * @author kroix
 */
public class Bill {
    private ArrayList<IPayable> bills;
    
    public void incluirConta(IPayable bill) {
        if (bill == null) {
            throw new IllegalArgumentException();
        }
        
        bills.add(bill);
    }
    
    public double calculateTotalBills() {
        return bills.stream().mapToDouble(IPayable::calculateAmountToPay).sum();
    }
    
    public ArrayList<IPayable> getBills() {
        return this.bills;
    }
}
