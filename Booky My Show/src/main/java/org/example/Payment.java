package org.example;

public class Payment {
    Integer id;
    Boolean paid;

    public Payment(Integer id, Boolean paid) {
        this.id = id;
        this.paid = paid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
