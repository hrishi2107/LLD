package org.example;

import javax.print.attribute.standard.Destination;

public class InternalButton {
    InternalButtonDispatcher internalbutDisp;
    int elevatorID;

    InternalButton( InternalButtonDispatcher internalbutDisp)
    {
        this.internalbutDisp = internalbutDisp;
    }


    void pressButton(int destinationFloor, Direction direction)
    {
        this.internalbutDisp.SubmitReq(destinationFloor,direction, elevatorID);
    }
}
