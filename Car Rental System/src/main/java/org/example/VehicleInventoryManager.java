package org.example;

import java.util.List;

public class VehicleInventoryManager {
    List<Vehicle> vehicleList;

    //CRUD to vehicles


    public VehicleInventoryManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle veh)
    {
        vehicleList.add(veh);
    }
    public void deleteVehicle(Vehicle veh)
    {
        vehicleList.remove(veh);
    }
}
