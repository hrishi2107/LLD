package org.example;

public class Vehicle {
    Integer VehicleNum;
    VehicleType vehicleType;

    public Vehicle(Integer vehicleNum, VehicleType vehicleType) {
        VehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
    }

    public Integer getVehicleNum() {
        return VehicleNum;
    }

    public void setVehicleNum(Integer vehicleNum) {
        VehicleNum = vehicleNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }




}
