package org.example;

import java.util.Date;

import static org.example.ReservationStatus.SCHEDULED;

public class Reservation {

    Integer reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    String bookedFrom;
    String bookedTill;
    Location pickupLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;
    Location storeLocation;
    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(String bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public String getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(String bookedTill) {
        this.bookedTill = bookedTill;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public Location getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(Location storeLocation) {
        this.storeLocation = storeLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }



    public static Reservation createReservation(User user,Vehicle vehicle, ReservationType resType){
        Reservation res = new Reservation();
        res.setUser(user);
        res.setVehicle(vehicle);
        res.setReservationType(resType);
        res.setReservationId(12313131);
        res.setReservationStatus(SCHEDULED);
        return res;
    }
}
