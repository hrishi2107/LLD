package org.example;

public class UpiPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("UPI payment done");
    }
}
