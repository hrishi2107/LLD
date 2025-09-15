package org.example;

import java.util.List;

public abstract class WarehouseSelectionStrategy {
    public abstract Warehouse getWarehouse(String strategyType, Address address, List<Warehouse> warehouseList);

}
