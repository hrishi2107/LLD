package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    UserController(){
        this.userList = new ArrayList<>();
    }

    public void addUser(User user)
    {
        this.userList.add(user);
    }

    public void removeUser(User user)
    {
        this.userList.remove(user);
    }
}
