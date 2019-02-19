package ticketMachine;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private int validityTime;
    private LocalDateTime timeOfPurchase;

    public Ticket(int validityTime, LocalDateTime timeOfPurchase) {
        this.validityTime = validityTime;
        this.timeOfPurchase = timeOfPurchase;
    }

    public Ticket(int validityTime) {
        this(validityTime, LocalDateTime.now());
    }

    public int getValidityTime() {
        return validityTime;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfPurchase, currentTime);
        return duration.toMinutes()<validityTime;
    }
    private String validityPrinter(int validityTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        Duration duration = Duration.ofMinutes(validityTime);
        int minutesAdded = (int) duration.toMinutes();
        LocalDateTime validity = timeOfPurchase.plusMinutes(minutesAdded);
        return dateTimeFormatter.format(validity);
    }

    @Override
    public String toString() {
        return "Okres: " + validityTime + " minut" + "\nWażny do: " + validityPrinter(validityTime);
    }
}
