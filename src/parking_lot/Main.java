package parking_lot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        initializeParkingLot();
    }

    static void initializeParkingLot() throws InterruptedException {
        List<Floor> floors = new ArrayList<>();

        floors.add(new Floor("B1", 1, 2, 1));
        floors.add(new Floor("B2", 8, 4, 5));
        floors.add(new Floor("B3", 2, 1, 3));

        ParkingLot parkingLot = new ParkingLot(1, floors);
        Vehicle[] vehicles = {new Vehicle("AP16EM3713", VehicleType.BIKE),
                new Vehicle("AP16EM3712", VehicleType.TRUCK),
                new Vehicle("AP16EM3714", VehicleType.BIKE),
                new Vehicle("AP16EM3715", VehicleType.TRUCK),
                new Vehicle("AP16EM3716", VehicleType.CAR),
                new Vehicle("AP16EM4716", VehicleType.CAR),
                new Vehicle("AP16EM4712", VehicleType.TRUCK),
                new Vehicle("AP16EM4714", VehicleType.BIKE),
                new Vehicle("AP16EM4715", VehicleType.CAR),
                new Vehicle("AP16EM5716", VehicleType.CAR),
                new Vehicle("AP16EM5712", VehicleType.TRUCK),
//                new Vehicle("AP16EM5714", VehicleType.BIKE),
//                new Vehicle("AP16EM5715", VehicleType.TRUCK),
//                new Vehicle("AP16EM5716", VehicleType.CAR)
        };
        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            tickets.add(parkingLot.parkVehicle(vehicles[i]));
        }
        Thread.sleep(100000);
        for (int i = 0; i <= 4; i++)
            parkingLot.unparkVehicle(tickets.get(i));
        for (int i = 5; i <= 9; i++) {
            parkingLot.parkVehicle(vehicles[i]);
        }
    }
}
