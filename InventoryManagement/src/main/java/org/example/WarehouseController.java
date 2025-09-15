package org.example;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouseList;
    WarehouseSelectionStrategy strategy;
    public WarehouseController(){
        this.warehouseList = new ArrayList<>();
    }

    public void addWarehouse(Warehouse warehouse)
    {
        this.warehouseList.add(warehouse);
    }
    public void removeWarehouse(Warehouse warehouse)
    {
        this.warehouseList.remove(warehouse);
    }
    public Warehouse getWarehouse(String strategyType, Address address)
    {
        if(strategyType.equalsIgnoreCase("NEAREST")) {
            strategy = new NearestWarehouseStrategy();
            return strategy.getWarehouse(strategyType, address, warehouseList);
        }

        return null;
    }

}
