package org.example;

public class Card {
    String CVV;
    String expiryDate;
    BankAccount account;

    public static String cardPin = "1234";

    public Card(String CVV, String expiryDate, BankAccount account) {
        this.CVV = CVV;
        this.expiryDate = expiryDate;
        this.account = account;
    }

    public boolean checkPin(String pin)
    {
        return cardPin.equalsIgnoreCase(pin);
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}
