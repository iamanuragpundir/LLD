import java.util.ArrayList;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started.");

        ParkingLot parkingLot = new ParkingLot("B1");

        parkingLot.parkingLotFloor.addSpace(new SedanSpace());
        parkingLot.parkingLotFloor.addSpace(new SUVSpace());
        parkingLot.parkingLotFloor.addSpace(new SedanSpace());
        parkingLot.parkingLotFloor.addSpace(new SUVSpace());

        HashMap<String, Vehicle> vehicles = new HashMap<>();
        vehicles.put("PB3506V8004", new Vehicle("PB06V8004", VehicleType.SEDAN));

        parkingLot.ticketManager.markEntry(vehicles.get("PB3506V8004"));
        Thread.sleep(10000);
        parkingLot.ticketManager.markExit(vehicles.get("PB3506V8004"));

    }
}
