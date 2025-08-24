package org.example;

public class ExternalButton {

    ExternalButtonDispatcher externalbutDisp;

    ExternalButton(ExternalButtonDispatcher externalbutDisp)
    {
        this.externalbutDisp = externalbutDisp;
    }


    void pressButton(int destinationFloor, Direction direction)
    {
        this.externalbutDisp.SubmitReq(destinationFloor,direction);
    }

}
