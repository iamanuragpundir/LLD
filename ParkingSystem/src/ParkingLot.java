public class ParkingLot {
    String floorId;
    ParkingLotSpace parkingLotSpace;
    TicketManager ticketManager;

    public void setFloorId(String floorId){
        this.floorId = floorId;
    }
    public String getFloorId() {
        return floorId;
    }

    public void addSpace(SpaceType st){
        parkingLotSpace.addSpace(st);
    }
    public void removeSpace(SpaceType st){
        parkingLotSpace.removeSpace(st);
    }

    public int generateTicket(Vehicle v){
        return ticketManager.generateTicket(v);
    }

}
