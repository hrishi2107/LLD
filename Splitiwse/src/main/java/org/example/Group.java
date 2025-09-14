package org.example;

import java.util.List;

public class Group {
    String id;
    String name;
    List<User> groupMembers;
    List<Expense> groupExpenses;
    ExpenseController expenseController = new ExpenseController();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Expense> getGroupExpenses() {
        return groupExpenses;
    }

    public void setGroupExpenses(List<Expense> groupExpenses) {
        this.groupExpenses = groupExpenses;
    }
    public void addGroupMember(User user)
    {
        this.groupMembers.add(user);
    }
    public void removeGroupMember(User user)
    {
        this.groupMembers.remove(user);
    }
    public void addGroupExpense(Expense expense)
    {
        this.groupExpenses.add(expense);
    }
    public void removeGroupExpense(Expense expense)
    {
        this.groupExpenses.remove(expense);
    }
}
