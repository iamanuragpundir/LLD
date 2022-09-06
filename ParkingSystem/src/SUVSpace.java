import com.sun.org.glassfish.gmbal.ManagedObject;

public class SUVSpace extends SpaceType{
    public final static String spaceTypeName = "SUV";
    public final static double chargePerHour = 100.0d;
    @Override
    public double getChargesPerHour() {
        return chargePerHour;
    }

    @Override
    public String getSpaceTypeName(){
        return spaceTypeName;
    }
}
