public class ParkingLot {
    ParkingLotFloor parkingLotFloor;
    TicketManager ticketManager;

    public ParkingLot(String floorId){
        parkingLotFloor = new ParkingLotFloor(floorId);
        ticketManager = new TicketManager();
    }

    public void addSpace(SpaceType st){
        parkingLotFloor.addSpace(st);
    }

    public void vehicleIn(Vehicle v){
        SpaceType st = v.resolveSpaceType();
        // check if corresponding space type is available, then only mark entry
        if(parkingLotFloor.hasSpaceAvailable(st)){
            ticketManager.markEntry(v);
            parkingLotFloor.useSpace(st);
        }

        System.out.println("No Space available this Vehicle");
    }

    public void vehicleOut(Vehicle v){
        ticketManager.markExit(v);
    }

}
