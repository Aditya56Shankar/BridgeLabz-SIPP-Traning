class VehicleDetails {
    static int registrationFee = 1000;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    public VehicleDetails(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Reg. Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class Vehicle {
    public static void main(String[] args) {
	VehicleDetails v1 = new VehicleDetails("Aditya", "A", 1);
        VehicleDetails v2 = new VehicleDetails("Riya", "B", 2);
	v1.displayDetails();
	v2.displayDetails();
	v1.updateRegistrationFee(1500);
	v1.displayDetails();


	}
}