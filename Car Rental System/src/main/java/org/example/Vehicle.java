package org.example;

public class Vehicle {
    String id;
    String name;
    Integer vehicleNum;
    VehicleType vType;
    Integer kMDriven;
    Status status;
    Integer hourlyPrice;
    Integer minutesPrice;
    Integer perDayPrice;
    Integer CC;

    public Vehicle(String id, String name, Integer vehicleNum, VehicleType vType, Integer kMDriven, Status status, Integer hourlyPrice, Integer minutesPrice, Integer perDayPrice, Integer CC) {
        this.id = id;
        this.name = name;
        this.vehicleNum = vehicleNum;
        this.vType = vType;
        this.kMDriven = kMDriven;
        this.status = status;
        this.hourlyPrice = hourlyPrice;
        this.minutesPrice = minutesPrice;
        this.perDayPrice = perDayPrice;
        this.CC = CC;
    }

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

    public Integer getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(Integer vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public VehicleType getvType() {
        return vType;
    }

    public void setvType(VehicleType vType) {
        this.vType = vType;
    }

    public Integer getkMDriven() {
        return kMDriven;
    }

    public void setkMDriven(Integer kMDriven) {
        this.kMDriven = kMDriven;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(Integer hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public Integer getMinutesPrice() {
        return minutesPrice;
    }

    public void setMinutesPrice(Integer minutesPrice) {
        this.minutesPrice = minutesPrice;
    }

    public Integer getPerDayPrice() {
        return perDayPrice;
    }

    public void setPerDayPrice(Integer perDayPrice) {
        this.perDayPrice = perDayPrice;
    }

    public Integer getCC() {
        return CC;
    }

    public void setCC(Integer CC) {
        this.CC = CC;
    }
}
