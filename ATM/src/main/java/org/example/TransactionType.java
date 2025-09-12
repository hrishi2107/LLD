package org.example;

public enum TransactionType {
    DEPOSIT,
    WITHDRAWAL,
    BALANCE_CHECK;

    public static void showTransactionTypes()
    {
        for(TransactionType type: TransactionType.values())
        {
            System.out.println(type.name());
        }
    }
}
