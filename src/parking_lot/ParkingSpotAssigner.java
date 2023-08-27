package parking_lot;

import java.util.List;

public class ParkingSpotAssigner {

    public ParkingSpot assignParkingSpot(Vehicle vehicle, List<Floor> floors) {
        int parkingSpotId = (int) (Math.random() * 1000);
        ParkingSpot parkingSpot = null;
        for (Floor floor : floors) {
            switch (vehicle.getType()) {
                case TRUCK:
                    parkingSpot = parkInLargeSpot(parkingSpotId, floor, vehicle);
                    break;
                case CAR:
                    parkingSpot = parkInMediumSpot(parkingSpotId, floor, vehicle);
                    break;
                case BIKE:
                    parkingSpot = parkInSmallSpot(parkingSpotId, floor, vehicle);
                    break;
            }
            if (parkingSpot != null)
                return parkingSpot;
        }
        return parkingSpot;
    }

    private ParkingSpot parkInLargeSpot(int parkingSpotId, Floor floor, Vehicle vehicle) {
        if (floor.getFreeLargeSpots() > 0) {
            ParkingSpot parkingSpot = getParkingSpot(parkingSpotId, ParkingSpotType.LARGE, vehicle, floor);
            floor.setFreeLargeSpots(floor.getFreeLargeSpots() - 1);
            floor.getLargeSpotList().add(parkingSpot);
            fillVehicleDetails(vehicle, parkingSpot);
            return parkingSpot;
        }
        return null;
    }

    private ParkingSpot parkInMediumSpot(int parkingSpotId, Floor floor, Vehicle vehicle) {
        if (floor.getFreeMediumSpots() > 0) {
            ParkingSpot parkingSpot = getParkingSpot(parkingSpotId, ParkingSpotType.MEDIUM, vehicle, floor);
            floor.setFreeMediumSpots(floor.getFreeMediumSpots() - 1);
            floor.getMediumSpotList().add(parkingSpot);
            fillVehicleDetails(vehicle, parkingSpot);
            return parkingSpot;
        }
        return parkInLargeSpot(parkingSpotId, floor, vehicle);
    }

    private ParkingSpot parkInSmallSpot(int parkingSpotId, Floor floor, Vehicle vehicle) {
        if (floor.getFreeSmallSpots() > 0) {
            ParkingSpot parkingSpot = getParkingSpot(parkingSpotId, ParkingSpotType.SMALL, vehicle, floor);
            floor.setFreeSmallSpots(floor.getFreeSmallSpots() - 1);
            floor.getSmallSpotList().add(parkingSpot);
            fillVehicleDetails(vehicle, parkingSpot);
            return parkingSpot;
        }
        return parkInMediumSpot(parkingSpotId, floor, vehicle);
    }

    private void fillVehicleDetails(Vehicle vehicle, ParkingSpot parkingSpot) {
        vehicle.setParkingSpot(parkingSpot);
    }

    ParkingSpot getParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType, Vehicle vehicle, Floor floor) {
        return new ParkingSpot(parkingSpotId, parkingSpotType, vehicle, floor);
    }
}
