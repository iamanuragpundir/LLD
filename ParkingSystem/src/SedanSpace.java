public class SedanSpace extends SpaceType{
    public final static String spaceTypeName = "Sedan";
    public final static double chargePerHour = 80.0d;
    @Override
    public double getChargesPerHour() {
        return chargePerHour;
    }

    @Override
    public String getSpaceTypeName(){
        return spaceTypeName;
    }
}
