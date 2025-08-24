package org.example;

public class Ticket {
    Integer entryTime;
    Vehicle vehicle;
    ParkingSpot spot;

    Ticket(TicketBuilder builder)
    {
        this.entryTime = builder.entryTime;
        this.vehicle = builder.vehicle;
        this.spot = builder.spot;
    }
    public static class TicketBuilder {

        Integer entryTime;
        Vehicle vehicle;
        ParkingSpot spot;

        public TicketBuilder setEntryTime(Integer entryTime) {
            this.entryTime = entryTime;
            return this;
        }

        public TicketBuilder setVehicle (Vehicle vehicle)
        {
            this.vehicle = vehicle;
            return this;
        }

        public TicketBuilder setSpot (ParkingSpot spot)
        {
            this.spot = spot;
            return this;
        }

        public Ticket build()
        {
            return new Ticket(this);
        }

    }

}
