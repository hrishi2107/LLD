package org.example;

public class Display {
    int upcomingFloor;
    Direction direction;

    Display(int floor, Direction dir)
    {
        this.upcomingFloor = floor;
        this.direction = dir;
    }

    void displayDetails()
    {
        System.out.println("Next stop is: floor-"+upcomingFloor+ ". We are going "+ direction.name());
    }
}
