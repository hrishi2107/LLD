package org.example;

public class User {
    String userId;
    String name;
    UserExpenseBalanceSheet balanceSheet;

    public User(String userId, String name, UserExpenseBalanceSheet balanceSheet) {
        this.userId = userId;
        this.name = name;
        this.balanceSheet = balanceSheet;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserExpenseBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(UserExpenseBalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
}
