package org.example;

import java.util.List;

public class Store {
    Integer storeId;
    VehicleInventoryManager vIM;
    Location location;
    List<Reservation> reservationList;

    public Reservation reserveVehicle(User user, Vehicle vehicle)
    {
        return Reservation.createReservation(user,vehicle,ReservationType.HOURLY); //createReservation is kept as static method intentionally so that we can use this method directly from that class without creating an object of the class and then calling this method
    }
}
