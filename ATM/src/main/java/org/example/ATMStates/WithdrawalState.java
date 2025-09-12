package org.example.ATMStates;

import org.example.ATM;
import org.example.ATMState;
import org.example.Card;
import org.example.WithdrawalProcessors.CashWithdrawalProcessor;
import org.example.WithdrawalProcessors.FiveHundredCashWithdrawalProcessor;
import org.example.WithdrawalProcessors.HundredCashWithdrawalProcessor;
import org.example.WithdrawalProcessors.ThousandCashWithdrawalProcessor;

public class WithdrawalState extends ATMState {

    WithdrawalState nextWithdrawal;
    public WithdrawalState() {
        System.out.println("Enter the amount for withdrawal");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        if(withdrawAmount > atm.getAtmBalance())
        {
            System.out.println("Atm does not have sufficient cash to complete the request");
            exit(atm);
        }
        else if(withdrawAmount > card.getAccount().getBalance())
        {
            System.out.println("Your account does not have sufficient funds to complete the request");
            exit(atm);
        }
        else {
            // Used chain of responsibility here
            CashWithdrawalProcessor processor = new ThousandCashWithdrawalProcessor( new FiveHundredCashWithdrawalProcessor( new HundredCashWithdrawalProcessor(null)));
            processor.withdraw(atm,withdrawAmount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
