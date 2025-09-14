package org.example;

import java.util.List;

public class UnequalSplit implements ExpenseSplit{
    @Override
    public boolean validateReq(List<Split> splitDetails, Double amount) {
        Double total = 0.0;
        for(Split sp: splitDetails)
        {
            total+=sp.getAmount();
        }
        return total.equals(amount);
    }
}
