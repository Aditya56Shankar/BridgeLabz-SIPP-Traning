public class Vehicle {
    public static void main(String[] args) {
        VehicleDetails v1 = new VehicleDetails("Aditya", "Car");
        VehicleDetails v2 = new VehicleDetails("Rahul", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        v1.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}

class VehicleDetails{
    String ownerName;
    String vehicleType;
    static int registrationFee;

    public VehicleDetails(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void  displayVehicleDetails(){
        System.out.println("owne name: "+ownerName);
        System.out.println("vehicle type: "+vehicleType);
        System.out.println("registration fee: "+registrationFee);
    }
    public static void updateRegistrationFee(int fee){
        registrationFee=fee;
        System.out.println("new registration fee: "+registrationFee);
    }
}
