package org.example.WithdrawalProcessors;

import org.example.ATM;

public class ThousandCashWithdrawalProcessor extends CashWithdrawalProcessor{

    public ThousandCashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, Integer remainingAmount) {
        int required =  remainingAmount/1000;
        int balance = remainingAmount%1000;

        if(required <= atm.getNoOfThousandNotes()) {
            atm.deductThousandNotes(required);
        }
        else if(required > atm.getNoOfThousandNotes()) {
            atm.deductThousandNotes(atm.getNoOfThousandNotes());
            balance = balance + (required-atm.getNoOfThousandNotes()) * 1000;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }

    }
}
