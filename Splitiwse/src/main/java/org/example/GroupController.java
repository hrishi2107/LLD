package org.example;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    GroupController(){
        this.groupList = new ArrayList<>();
    }

    public void addGroup(Group group)
    {
        this.groupList.add(group);
    }

    public void removeGroup(Group group)
    {
        this.groupList.remove(group);
    }

}
