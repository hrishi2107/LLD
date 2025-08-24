package org.example;

public class EntryGate {

    ParkingManagerFactory factory;
    Ticket ticket;

    public EntryGate(ParkingManagerFactory factory, Ticket ticket) {
        this.factory = factory;
        this.ticket = ticket;
    }

    public ParkingSpot findSpot(VehicleType type)
    {
        return null;
    }
    public void bookSpot(Vehicle vehicle)
    {

    }
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot)
    {
        return new Ticket.TicketBuilder().setEntryTime(123).setSpot(spot).setVehicle(vehicle).build();
    }

}
