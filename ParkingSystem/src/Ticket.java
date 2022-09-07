import java.util.Date;

public class Ticket {
    String id;
    long entryDateTime, exitDateTime;
    Vehicle vehicle;
    double parkingChargesPerHour;
    VehicleStatus vehicleStatus;

    Ticket(){}
    public Ticket(Vehicle vehicle){
        this.vehicle = vehicle;
        entryDateTime = CurrentDate.getCurrentDateTime();
        vehicleStatus = VehicleStatus.IN_PARKINGLOT;

        switch (vehicle.vehicleType){
            case SEDAN: parkingChargesPerHour = SedanSpace.chargePerHour; break;
            case SUV: parkingChargesPerHour = SUVSpace.chargePerHour; break;
        }
    }
    int parkedDurationInHours(){
        Date dt = new Date(exitDateTime - entryDateTime);
        int parkedDurationHrs =(int) Math.ceil((double)dt.getSeconds() / 3600);
        System.out.println(parkedDurationHrs);
        return parkedDurationHrs;
    }

    public double calculateTotalCharges(){
        double charges = parkedDurationInHours() * parkingChargesPerHour;
        return  charges;
    }

}
