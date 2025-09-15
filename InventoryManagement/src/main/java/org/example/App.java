package org.example;

public class App {
    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    public App(UserController userController, WarehouseController warehouseController, OrderController orderController) {
        this.userController = userController;
        this.warehouseController = warehouseController;
        this.orderController = orderController;
    }

}
