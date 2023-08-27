package parking_lot;

import java.util.List;

public class ParkingLot {
    int parkingLotId;
    private List<Floor> floors;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotId, List<Floor> floors) {
        this.parkingLotId = parkingLotId;
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingSpotAssigner assigner = new ParkingSpotAssigner();
        ParkingSpot parkingSpot = assigner.assignParkingSpot(vehicle, floors);
        if (parkingSpot == null) {
            System.out.println("No ParkingSpot for " + vehicle.getType() + " is available");
            return null;
        } else {
            Ticket ticket = new Ticket().generateTicket(parkingSpot);
            System.out.println(ticket + " generated successfully");
            return ticket;
        }
    }

    public void unparkVehicle(Ticket ticket) {
        if (ticket.getParkingSpot() == null) {
            System.out.println("Vehicle is not parked");
            return;
        }
        ParkingSpotUnassigner unassigner = new ParkingSpotUnassigner();
        unassigner.unassign(ticket.getParkingSpot().getVehicle());
        FareCalculator fareCalculator = new FareCalculator();
        Long cost = fareCalculator.calculateFare(ticket);
        System.out.println("Parking Cost:" + cost);
    }
}
