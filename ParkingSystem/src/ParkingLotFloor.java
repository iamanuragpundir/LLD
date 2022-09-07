import java.util.HashMap;

public class ParkingLotFloor {
    String floorId;
    HashMap<SpaceType, Integer> totalSpace;
    HashMap<SpaceType, Integer> availableSpace;

    public ParkingLotFloor(String floorId){
        this.floorId = floorId;
        totalSpace = new HashMap<>();
        availableSpace = new HashMap<>();
    }
    public void addSpace(SpaceType st){
        if(totalSpace.containsKey(st))
            totalSpace.put(st, totalSpace.get(st) + 1);
        else totalSpace.put(st, 1);
    }

    public void useSpace(SpaceType st){
        if(hasSpaceAvailable(st))
            availableSpace.put(st, availableSpace.get(st) - 1);
        else System.out.println("No space avaialable for this type of Vehicle.");
    }

    public void freeSpace(SpaceType st){
        availableSpace.put(st, availableSpace.get(st) +  1);
    }

    public boolean hasSpaceAvailable(SpaceType st){
        return (st != null) ? availableSpace.get(st) > 1 : false;
    }

    public int getAvailableSpace(SpaceType st){
        if(availableSpace.containsKey(st)) return availableSpace.get(st);
        return 0;
    }
}
