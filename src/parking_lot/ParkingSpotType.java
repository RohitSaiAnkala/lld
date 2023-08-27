package parking_lot;

public enum ParkingSpotType {
    LARGE, MEDIUM, SMALL;
    public Integer getParkingSpotTypeRate(ParkingSpotType type) {
        switch (type) {
            case LARGE:
                return 30;
            case MEDIUM:
                return 20;
            case SMALL:
                return 10;
        }
        return null;
    }
};

