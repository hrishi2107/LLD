package org.example;

public class Warehouse {
    Inventory inventory;
    Address address;
    public Warehouse(){
        this.inventory = new Inventory();
    }

    public void addItem(ProductCategory productCategory)
    {
        this.inventory.addProductCategory(productCategory);
    }
    public void removeItem(ProductCategory productCategory)
    {
        this.inventory.removeProductCategory(productCategory);
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
