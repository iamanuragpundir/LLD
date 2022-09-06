import java.util.HashMap;

public class ParkingLotSpace {
    HashMap<SpaceType, Integer> totalSpace;
    HashMap<SpaceType, Integer> availableSpace;

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

    public boolean hasSpaceAvailable(SpaceType st){
        return availableSpace.get(st) > 1;
    }

    public void removeSpace(SpaceType st){
        if(totalSpace.containsKey(st) &&  totalSpace.get(st) > 0)
            totalSpace.remove(st);
        else System.out.println("No such space.");
    }

    public int getAvailableSpace(SpaceType st){
        if(availableSpace.containsKey(st)) return availableSpace.get(st);
        return 0;
    }
}
