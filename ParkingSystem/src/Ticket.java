import java.util.Date;

public class Ticket {
    String id;
    long entryDateTime, exitDateTime;
    Vehicle vehicle;
    double totalParkingCharges;

    Ticket(){}
    Ticket(Vehicle vehicle){
        this.vehicle = vehicle;
        entryDateTime = CurrentDate.getCurrentDateTime();
    }

    int parkedDurationInHours(){
        Date dt = new Date(exitDateTime - entryDateTime);
        return dt.getHours();
    }

    double calculateTotalCharges(){
        double charges = parkedDurationInHours() * totalParkingCharges;
        return  charges;
    }

}
