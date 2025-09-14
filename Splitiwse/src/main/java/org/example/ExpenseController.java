package org.example;

import java.util.List;

public class ExpenseController {
    SplitFactory factory = new SplitFactory();
    UserExpBalSheetController balSheetController = new UserExpBalSheetController();

    public Expense creteExpense(String id, String desc, Double amount, User paidBy, SplitType type, List<Split> splitDetails)
    {
        ExpenseSplit expenseSplit = factory.getSplitObject(type);
        if(expenseSplit.validateReq(splitDetails,amount))
            System.out.println("Split details do not align with Split type");
        else {
            balSheetController.updateUserExpenseBalanceSheet(paidBy,amount,splitDetails);
            return new Expense(id,desc,amount,paidBy,type,splitDetails);
        }
        return null;
    }

}
