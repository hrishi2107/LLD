package org.example.WithdrawalProcessors;

import org.example.ATM;

public class CashWithdrawalProcessor {

    CashWithdrawalProcessor nextProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(ATM atm, Integer amount) {
        if(nextProcessor != null)
            nextProcessor.withdraw(atm,amount);
    }

}
