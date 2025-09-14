package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    Map<User,Balance> friendsBalance;
    Double totalMyExpense;
    Double totalPayment;
    Double totalAmtOwed;
    Double totalAmtGetBack;

    UserExpenseBalanceSheet(){
        this.friendsBalance = new HashMap<>();
        this.totalMyExpense = 0.0;
        this.totalAmtGetBack = 0.0;
        this.totalPayment = 0.0;
        this.totalAmtOwed = 0.0;
    }

    public Map<User, Balance> getFriendsBalance() {
        return friendsBalance;
    }

    public void setFriendsBalance(Map<User, Balance> friendsBalance) {
        this.friendsBalance = friendsBalance;
    }

    public Double getTotalMyExpense() {
        return totalMyExpense;
    }

    public void setTotalMyExpense(Double totalMyExpense) {
        this.totalMyExpense = totalMyExpense;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Double getTotalAmtOwed() {
        return totalAmtOwed;
    }

    public void setTotalAmtOwed(Double totalAmtOwed) {
        this.totalAmtOwed = totalAmtOwed;
    }

    public Double getTotalAmtGetBack() {
        return totalAmtGetBack;
    }

    public void setTotalAmtGetBack(Double totalAmtGetBack) {
        this.totalAmtGetBack = totalAmtGetBack;
    }
}
