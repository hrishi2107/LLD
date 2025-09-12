package org.example.ATMStates;

import org.example.ATM;
import org.example.ATMState;
import org.example.Card;
import org.example.TransactionType;

import static org.example.TransactionType.WITHDRAWAL;

public class SelectOptionsState extends ATMState {

    public SelectOptionsState() {
        TransactionType.showTransactionTypes();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        switch(txnType) {
            case WITHDRAWAL:
                atm.setCurrentState( new WithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentState( new CheckBalanceState());
                break;
            default : {
                System.out.println("Invalid Option");
                exit(atm);
            }

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
