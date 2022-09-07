public class SedanSpace extends SpaceType{
    public final static SpaceTypeName spaceTypeName = SpaceTypeName.SEDAN;
    public final static double chargePerHour = 80.0d;
    @Override
    public double getChargesPerHour() {
        return chargePerHour;
    }

    @Override
    public SpaceTypeName getSpaceTypeName(){
        return spaceTypeName;
    }
}
