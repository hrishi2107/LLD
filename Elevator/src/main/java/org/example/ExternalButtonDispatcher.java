package org.example;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;
    ElevatorStrategy strategy;
    void SubmitReq(int destinationFloor, Direction direction)
    {
        //following odd-even strat for ease - fuck it, we'll implement strategy design pattern here

        strategy = new OddEvenStrategy();
        strategy.submitReq(destinationFloor,direction,elevatorControllerList);

    }
}
