package org.example;

import java.util.List;

public class Expense {
    String id;
    String desc;
    Double amount;
    User paidBy;
    SplitType type;
    List<Split> splitDetails;

    public Expense(String id, String desc, Double amount, User paidBy, SplitType type, List<Split> splitDetails) {
        this.id = id;
        this.desc = desc;
        this.amount = amount;
        this.paidBy = paidBy;
        this.type = type;
        this.splitDetails = splitDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public SplitType getType() {
        return type;
    }

    public void setType(SplitType type) {
        this.type = type;
    }

    public List<Split> getSplitDetails() {
        return splitDetails;
    }

    public void setSplitDetails(List<Split> splitDetails) {
        this.splitDetails = splitDetails;
    }
}
