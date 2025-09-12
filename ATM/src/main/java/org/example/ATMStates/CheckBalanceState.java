package org.example.ATMStates;

import org.example.ATM;
import org.example.ATMState;
import org.example.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Account balance is: "+ card.getAccount().getBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card.");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }
}
