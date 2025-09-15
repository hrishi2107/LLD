package org.example;

public class Invoice {
    int totalPrice;
    int totalTax;

    public Invoice(int totalPrice, int totalTax) {
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(int totalTax) {
        this.totalTax = totalTax;
    }
}
