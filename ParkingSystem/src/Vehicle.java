public class Vehicle {
    String regNumber;

    VehicleType vehicleType;

    Vehicle() {}
    Vehicle (String regNumber, VehicleType vehicleType) {
        this.regNumber = regNumber;
        this.vehicleType = vehicleType;
    }

    public SpaceType resolveSpaceType() {

        switch (vehicleType) {
            case SUV:
                return new SUVSpace();
            case SEDAN:
                return new SedanSpace();
            default:
                throw new IllegalStateException("Unexpected value: " + vehicleType);
        }
    }
}
