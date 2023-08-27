package parking_lot;

public class ParkingSpotUnassigner {

    public void unassign(Vehicle vehicle) {
        if (vehicle.getParkingSpot() == null) {
            System.out.println("Vehicle is not parked");
            return;
        }
        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        Floor floor = parkingSpot.getFloor();
        ParkingSpotType parkingSpotType = parkingSpot.getType();
        switch (parkingSpotType) {
            case LARGE:
                floor.setFreeLargeSpots(floor.getFreeLargeSpots() + 1);
                vehicle.setParkingSpot(null);
                floor.getLargeSpotList().remove(parkingSpot);
                break;
            case MEDIUM:
                floor.setFreeMediumSpots(floor.getFreeMediumSpots() + 1);
                vehicle.setParkingSpot(null);
                floor.getMediumSpotList().remove(parkingSpot);
                break;
            case SMALL:
                floor.setFreeSmallSpots(floor.getFreeSmallSpots() + 1);
                vehicle.setParkingSpot(null);
                floor.getSmallSpotList().remove(parkingSpot);
                break;
        }
        System.out.println(vehicle + " unparked successfully");
    }
}
