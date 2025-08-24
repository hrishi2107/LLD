package org.example;

import java.util.List;

public class InternalButtonDispatcher {

    List<ElevatorController> elevatorControllerList;
    void SubmitReq(int destinationFloor, Direction direction, int elevatorID)
    {
        for(int i=0;i<elevatorControllerList.size();i++){
            if(elevatorControllerList.get(i).elevatorCar.elevatorId == elevatorID)
            {
                elevatorControllerList.get(i).addReq(destinationFloor, direction);
            }
        }
    }
}
