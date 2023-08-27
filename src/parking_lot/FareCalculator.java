package parking_lot;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FareCalculator {
    public Long calculateFare(Ticket ticket) {
        if (ticket == null) {
            System.out.println("Ticket is null...Cannot calculate fare");
            return null;
        }
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        if (parkingSpot == null) {
            System.out.println("No parking Spot is alloted..Cannot calculate fare");
            return null;
        }
        ParkingSpotType type = parkingSpot.getType();
        long hoursParked = getHoursParked(ticket);
        Integer costPerHour = type.getParkingSpotTypeRate(type);
        return hoursParked * costPerHour;
    }

    private long getHoursParked(Ticket ticket) {
        LocalTime entryTime = ticket.getEntryTime();
        LocalTime exitTime = LocalTime.now();
        long numberOfHours = ChronoUnit.HOURS.between(entryTime, exitTime);
        return numberOfHours;
    }
}
