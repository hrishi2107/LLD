package org.example;

import java.util.List;

public class TwoWheelerPSManger extends ParkingSpotManager{

    List<ParkingSpot> list;

    TwoWheelerPSManger(List<ParkingSpot> list){
        super(list);
    }
}
