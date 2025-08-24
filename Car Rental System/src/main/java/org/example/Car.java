package org.example;

public class Car extends Vehicle{

    Car(String id, String name, Integer vehicleNum, VehicleType vType, Integer kMDriven, Status status, Integer hourlyPrice, Integer minutesPrice, Integer perDayPrice, Integer CC){
        super(id,name,vehicleNum,vType,kMDriven,status,hourlyPrice,minutesPrice,perDayPrice,CC);
        setHourlyPrice(10);
        setMinutesPrice(15);
        setPerDayPrice(5);
    }
}
