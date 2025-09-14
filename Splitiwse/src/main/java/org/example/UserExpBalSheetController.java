package org.example;

import java.util.List;

public class UserExpBalSheetController {
    public void updateUserExpenseBalanceSheet(User paidBy, Double amount, List<Split> splitDetails) {

        paidBy.getBalanceSheet().setTotalPayment(paidBy.getBalanceSheet().getTotalPayment()+amount);
        UserExpenseBalanceSheet paidByUserExpenseSheet = paidBy.getBalanceSheet();
        for(Split split : splitDetails) {

            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseSheet = userOwe.getBalanceSheet();
            double oweAmount = split.getAmount();

            if(paidBy.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalMyExpense(paidByUserExpenseSheet.getTotalMyExpense()+oweAmount);
            }
            else {

                //update the balance of paid user
                paidByUserExpenseSheet.setTotalAmtGetBack(paidByUserExpenseSheet.getTotalAmtGetBack() + oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseSheet.getFriendsBalance().containsKey(userOwe)) {

                    userOweBalance = paidByUserExpenseSheet.getFriendsBalance().get(userOwe);
                }
                else {
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getFriendsBalance().put(userOwe, userOweBalance);
                }

                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);


                //update the balance sheet of owe user
                oweUserExpenseSheet.setTotalAmtOwed(oweUserExpenseSheet.getTotalAmtOwed() + oweAmount);
                oweUserExpenseSheet.setTotalMyExpense(oweUserExpenseSheet.getTotalMyExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpenseSheet.getFriendsBalance().containsKey(paidBy)){
                    userPaidBalance = oweUserExpenseSheet.getFriendsBalance().get(paidBy);
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserExpenseSheet.getFriendsBalance().put(paidBy, userPaidBalance);
                }
                userPaidBalance.setAmountOwed(userPaidBalance.getAmountOwed() + oweAmount);
            }
        }


    }
    public void displayExpenseBalanceSheet(User user)
    {
        System.out.println(user.getName()+ "'s Balance sheet details -");
        System.out.println("Total Expense - "+ user.getBalanceSheet().getTotalAmtGetBack());
        System.out.println("Total Payment done - "+ user.getBalanceSheet().getTotalPayment());
        System.out.println("Total Amount owed - "+ user.getBalanceSheet().getTotalAmtOwed());
        System.out.println("Friendwise details - ");

        for(User key: user.getBalanceSheet().getFriendsBalance().keySet())
        {
            System.out.println(key.getName() + "owes - " +
                    user.getBalanceSheet().getFriendsBalance().get(key).getAmountOwed() +
                    " gets back - "+ user.getBalanceSheet().getFriendsBalance().get(key).getAmountGetBack());
        }
        System.out.println("End of Balance sheet");
    }
}
