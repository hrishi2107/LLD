package org.example;

import java.util.List;

public class Screen {
    Integer id;
    List<Seat> seats;

    public Screen(Integer id, List<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
