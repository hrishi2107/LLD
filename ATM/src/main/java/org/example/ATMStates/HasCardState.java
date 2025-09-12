package org.example.ATMStates;

import org.example.ATM;
import org.example.ATMState;
import org.example.Card;

public class HasCardState extends ATMState {
    public HasCardState()
    {
        System.out.println("Please enter your pin.");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {

        if(card.checkPin("1234"))
        {
            System.out.println("Card Validated");
            atm.setCurrentState(new SelectOptionsState());
        }
        else
        {
            System.out.println("Invalid PIN");
            exit(atm);
        }
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
