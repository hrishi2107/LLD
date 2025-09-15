package org.example;

import java.util.List;

public class NearestWarehouseStrategy extends WarehouseSelectionStrategy{
    @Override
    public Warehouse getWarehouse(String strategyType, Address address, List<Warehouse> warehouseList)
    {
        return warehouseList.get(0);
    }
}
