package org.example;

import java.util.List;

public class PercentageSplit implements ExpenseSplit{
    @Override
    public boolean validateReq(List<Split> splitDetails, Double amount) {
        return false;
    }
}
