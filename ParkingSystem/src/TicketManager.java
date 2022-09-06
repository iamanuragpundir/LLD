import java.util.HashSet;

public class TicketManager {

    HashSet<Ticket> ticket;

    public void markEntry(Vehicle v) {
        ticket.add(new Ticket(v));
    }

    public void markExit(Vehicle v) {

    }
}
