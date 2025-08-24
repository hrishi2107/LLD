package org.example;
import java.util.List;
public interface ElevatorStrategy {


    void submitReq(int destFloor, Direction direction, List<ElevatorController> elevatorControllerList);
}
