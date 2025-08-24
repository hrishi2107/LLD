package org.example;

public class Bike extends Vehicle{
    Bike(String id, String name, Integer vehicleNum, VehicleType vType, Integer kMDriven, Status status, Integer hourlyPrice, Integer minutesPrice, Integer perDayPrice, Integer CC){
        super(id,name,vehicleNum,vType,kMDriven,status,hourlyPrice,minutesPrice,perDayPrice,CC);
        setHourlyPrice(8);
        setMinutesPrice(10);
        setPerDayPrice(4);
    }

}
