import java.util.HashMap;

public class TicketManager {

    HashMap<Vehicle, Ticket> tickets;


    public TicketManager(){
        tickets = new HashMap<>();
    }
    public void markEntry(Vehicle v) {
        tickets.put(v, new Ticket(v));
    }

    public void markExit(Vehicle v) {
        // collect total charges
        Ticket ticket = this.tickets.get(v);

        double charges = ticket.calculateTotalCharges();
        System.out.print("Colected Rs. ");
        System.out.print(charges);

        //TODO remove the Vehicle from the ParkingLot and mark the space as available.
        ticket.vehicleStatus = VehicleStatus.NOT_IN_PARKINGLOT;

    }
}
