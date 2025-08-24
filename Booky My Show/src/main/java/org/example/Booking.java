package org.example;

import java.util.List;

public class Booking {
    Integer id;
    Show show;
    List<Seat> seats;
    Payment payment;

    public Booking(Integer id, Show show, List<Seat> seats, Payment payment) {
        this.id = id;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
