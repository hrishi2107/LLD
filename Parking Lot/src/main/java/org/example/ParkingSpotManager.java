package org.example;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> list;

    ParkingSpotManager(List<ParkingSpot> list){
        this.list = list;
    }

    ParkingSpot findParking()
    {
        return new ParkingSpot();
    }

    void parkVehicle(ParkingSpot spot, Vehicle vehicle)
    {
        //use park vehicle method of specific parkingspot
    }

    void removeVehicle(ParkingSpot spot)
    {
        //use remove vehicle method of specific parkingspot
    }

}
