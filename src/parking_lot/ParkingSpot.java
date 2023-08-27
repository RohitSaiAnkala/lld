package parking_lot;

public class ParkingSpot {
    private int spotId;
    private ParkingSpotType type;
    private Vehicle vehicle;
    private Floor floor;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotId, ParkingSpotType type, Vehicle vehicle, Floor floor) {
        this.spotId = spotId;
        this.type = type;
        this.vehicle = vehicle;
        this.floor = floor;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId=" + spotId +
                ", type=" + type +
                ", vehicle=" + vehicle +
                ", floor=" + floor +
                '}';
    }
}
