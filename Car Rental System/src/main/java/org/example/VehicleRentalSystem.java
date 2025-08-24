package org.example;


import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }
//CRUD to add users and stores

    public void addUser(User user)
    {
        users.add(user);
    }
    public void removeUser(User user)
    {
        users.remove(user);
    }

    public void addStore( Store store)
    {
        stores.add(store);
    }
     public void removeStore( Store store)
     {
         stores.remove(store);
     }


}
