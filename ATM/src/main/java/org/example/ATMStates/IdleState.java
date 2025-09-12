package org.example.ATMStates;

import org.example.ATM;
import org.example.ATMState;
import org.example.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard (ATM atm, Card card)
    {
        System.out.println("Please insert the card");
        atm.setCurrentState(new HasCardState());
    }
}
