package org.example;

import java.util.List;

public interface ExpenseSplit {
    public boolean validateReq(List<Split> splitDetails, Double amount);
}
