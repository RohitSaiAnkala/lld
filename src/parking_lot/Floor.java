package parking_lot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private String floorNumber;
    private int freeLargeSpots;
    private int freeMediumSpots;
    private int freeSmallSpots;
    private List<ParkingSpot> largeSpotList = new ArrayList<>();
    private List<ParkingSpot> mediumSpotList = new ArrayList<>();
    private List<ParkingSpot> smallSpotList = new ArrayList<>();

    public Floor() {
    }

    public Floor(String floorNumber, int freeLargeSpots, int freeMediumSpots, int freeSmallSpots) {
        this.floorNumber = floorNumber;
        this.freeLargeSpots = freeLargeSpots;
        this.freeMediumSpots = freeMediumSpots;
        this.freeSmallSpots = freeSmallSpots;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFreeLargeSpots() {
        return freeLargeSpots;
    }

    public void setFreeLargeSpots(int freeLargeSpots) {
        this.freeLargeSpots = freeLargeSpots;
    }

    public int getFreeMediumSpots() {
        return freeMediumSpots;
    }

    public void setFreeMediumSpots(int freeMediumSpots) {
        this.freeMediumSpots = freeMediumSpots;
    }

    public int getFreeSmallSpots() {
        return freeSmallSpots;
    }

    public void setFreeSmallSpots(int freeSmallSpots) {
        this.freeSmallSpots = freeSmallSpots;
    }

    public List<ParkingSpot> getLargeSpotList() {
        return largeSpotList;
    }

    public void setLargeSpotList(List<ParkingSpot> largeSpotList) {
        this.largeSpotList = largeSpotList;
    }

    public List<ParkingSpot> getMediumSpotList() {
        return mediumSpotList;
    }

    public void setMediumSpotList(List<ParkingSpot> mediumSpotList) {
        this.mediumSpotList = mediumSpotList;
    }

    public List<ParkingSpot> getSmallSpotList() {
        return smallSpotList;
    }

    public void setSmallSpotList(List<ParkingSpot> smallSpotList) {
        this.smallSpotList = smallSpotList;
    }

    @Override
    public String toString() {
        return floorNumber;
    }
}
