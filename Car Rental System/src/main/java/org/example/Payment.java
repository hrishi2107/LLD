package org.example;

public class Payment {

    public void payBill(Bill bill)
    {
        System.out.println("Payment done");
        bill.setPaid(true);
    }
}
