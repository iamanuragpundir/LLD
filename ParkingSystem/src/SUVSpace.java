import com.sun.org.glassfish.gmbal.ManagedObject;

public class SUVSpace extends SpaceType{
    public final static SpaceTypeName spaceTypeName = SpaceTypeName.SUV;
    public final static double chargePerHour = 100.0d;
    @Override
    public double getChargesPerHour() {
        return chargePerHour;
    }

    @Override
    public SpaceTypeName getSpaceTypeName(){
        return spaceTypeName;
    }
}
