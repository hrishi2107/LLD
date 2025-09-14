package org.example;

import java.util.List;

public class EqualSplit implements ExpenseSplit{
    @Override
    public boolean validateReq(List<Split> splitDetails, Double amount) {
        return splitDetails.get(0).getAmount() == (amount/splitDetails.size());
    }
}
