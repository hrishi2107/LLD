package org.example;

public class CashPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Cash Payment done");
    }
}
