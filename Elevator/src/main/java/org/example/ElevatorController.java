package org.example;

import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer>pqUp;
    PriorityQueue<Integer>pqDown;

    ElevatorController(ElevatorCar car)
    {
        this.elevatorCar = car;
        pqUp = new PriorityQueue<>(); //ascending priority queue
        pqDown = new PriorityQueue<>((a,b) -> b-a); //descending priority queue
    }

    void moveElevator(int floor, Direction direction)
    {
        elevatorCar.display.upcomingFloor = floor;
        elevatorCar.display.direction = direction;
        elevatorCar.display.displayDetails();
    }
    void addReq(int floor, Direction direction)
    {

    }

}
