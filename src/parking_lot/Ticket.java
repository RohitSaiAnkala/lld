package parking_lot;

import java.time.LocalTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private LocalTime entryTime;

    public Ticket() {
    }

    public Ticket(ParkingSpot parkingSpot, LocalTime entryTime) {
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public Ticket generateTicket(ParkingSpot parkingSpot) {
        if (parkingSpot.getVehicle() != null)
            return new Ticket(parkingSpot, LocalTime.now());
        System.out.println("Ticket already generated for vehicle");
        return null;
        // need to add the implementation
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "parkingSpot=" + parkingSpot +
                ", entryTime=" + entryTime +
                '}';
    }
}
