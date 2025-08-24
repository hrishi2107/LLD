package org.example;

public class ParkingSpot {

    Integer id;
    Integer price;
    Boolean isEmpty;
    Vehicle vehicle;

    ParkingSpot(){
        isEmpty = true;
        vehicle = null;
        id = null;
        price = null;
    }

    public ParkingSpot(Integer id, Integer price, Boolean isEmpty, Vehicle vehicle) {
        this.id = id;
        this.price = price;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void parkVehicle(Vehicle veh)
    {
        isEmpty = false;
        vehicle = veh;
    }
    void removeVehicle()
    {
        isEmpty = true;
        vehicle = null;
    }

}
