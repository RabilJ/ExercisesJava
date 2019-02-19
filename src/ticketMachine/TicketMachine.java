package ticketMachine;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class TicketMachine {

    public static void buyTicket(Passenger passenger,int validityTime) {
        Ticket ticket = new Ticket(validityTime);
        passenger.setTicket(ticket);
    }
}
