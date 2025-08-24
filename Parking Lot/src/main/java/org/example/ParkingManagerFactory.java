package org.example;

import java.util.List;

import static org.example.VehicleType.FOUR_WHEELER;
import static org.example.VehicleType.TWO_WHEELER;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingManager(VehicleType type)
    {
        if(type == TWO_WHEELER)
            return new TwoWheelerPSManger(null); // we'll have to create a service that gives the list of 2 wheeler spots
        else if(type == FOUR_WHEELER)
            return new FourWheelerPSManager(null);
        else
            throw new IllegalArgumentException("Unknown vehicle type");// we'll have to create a service that gives the list of 4 wheeler spots
    }

}
