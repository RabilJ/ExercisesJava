package ticketMachine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketController {
    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Jakub", "Popielarski"));
        passengers.add(new Passenger("Antoni", "Mroczek"));
        passengers.add(new Passenger("Jan", "Bordo"));
        passengers.add(new Passenger("Jarosław", "Niebieski"));
        TicketMachine.buyTicket(passengers.get(0), 15);
        TicketMachine.buyTicket(passengers.get(1), 30);
        TicketMachine.buyTicket(passengers.get(2), 60);
        Ticket invalidTicket = new Ticket(15, LocalDateTime.now().minusMinutes(20));
        passengers.get(3).setTicket(invalidTicket);
        List<Passenger> peopleWithoutValidTicket = validateTickets(passengers);
        List<Passenger> peopleWithValidTickets = getValid(passengers);
        System.out.println("Na gapę jadą:");
        for (Passenger passenger : peopleWithoutValidTicket) {
            System.out.println(passenger);
        }
        System.out.println("\nWażny bilet mają:");
        for (Passenger person : peopleWithValidTickets) {
            System.out.println(person);
        }

    }

    private static List<Passenger> validateTickets(List<Passenger> passengers) {
        List<Passenger> withoutTicket = new ArrayList<>();
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if (ticket == null || !ticket.isValid()) {
                withoutTicket.add(passenger);
            }
        }
        return withoutTicket;
    }
    private static List<Passenger> getValid(List<Passenger> passengers) {
        List<Passenger> withTicket = new ArrayList<>();
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if (ticket == null || ticket.isValid()) {
                withTicket.add(passenger);
            }
        }
        return withTicket;
    }
}