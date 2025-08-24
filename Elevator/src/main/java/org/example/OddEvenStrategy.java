package org.example;
import java.util.List;
public class OddEvenStrategy implements ElevatorStrategy{
    @Override

    public void submitReq(int destFloor, Direction direction, List<ElevatorController> elevatorControllerList) {
        for(ElevatorController e : elevatorControllerList)
        {
            if(e.elevatorCar.elevatorId % 2 == 0 && destFloor % 2 == 0)
            {
                e.addReq(destFloor,direction);
            }
            else if( e.elevatorCar.elevatorId % 2 == 1 && destFloor % 2 == 1)
            {
                e.addReq(destFloor,direction);
            }
        }
    }
}
