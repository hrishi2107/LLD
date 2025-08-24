package org.example;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(Integer id, Integer price, Boolean isEmpty, Vehicle vehicle) {
        super(id, price, isEmpty, vehicle);
        setPrice(20);
    }
}
