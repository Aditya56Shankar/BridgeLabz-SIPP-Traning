public class VehicalRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("CAR123", "Sedan", 1500, "CARINS123",12);
        Bike bike = new Bike("BIKE456", "Sports", 500, "BIKEINS456",32);
        Truck truck = new Truck("TRUCK789", "Heavy", 3000, "TRUCKINS789",15);

        System.out.println("---- CAR DETAILS ----");
        car.showRentalCost(5);
        car.showInsuranceCost();
        car.showTotalCost(5);

        System.out.println("---- BIKE DETAILS ----");
        bike.showRentalCost(5);
        bike.showInsuranceCost();
        bike.showTotalCost(5);

        System.out.println("---- TRUCK DETAILS ----");
        truck.showRentalCost(5);
        truck.showInsuranceCost();
        truck.showTotalCost(5);
    }
}

interface Insurable {
    int calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract int calculateRentalCost(int days);

    public void showRentalCost(int days) {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        int rentalCost = calculateRentalCost(days);
        System.out.println("Rental cost for " + days + " days: ₹" + rentalCost);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public int getRentalRate() {
        return rentalRate;
    }
}

class Car extends Vehicle  {
    private String insurancePolicyNumber;
    int insurance;

    public Car(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber,int insurance) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insurance=insurance;
    }

    @Override
    public int calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public int calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: " + insurancePolicyNumber;
    }

    public void showInsuranceCost() {
        System.out.println("Insurance cost: ₹" + calculateInsurance());
        System.out.println(getInsuranceDetails());
    }

    public void showTotalCost(int days) {
        int total = calculateRentalCost(days) + calculateInsurance();
        System.out.println("Total cost (Rental + Insurance): ₹" + total);
        System.out.println();
    }
}


class Bike extends Vehicle  {
    private String insurancePolicyNumber;
    int insurance;
    public Bike(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber,int insurance) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insurance=insurance;
    }

    @Override
    public int calculateRentalCost(int days) {
        int cost = days * getRentalRate();
        if (days > 3) {
            cost -= 500;
        }
        return cost;
    }

    @Override
    public int calculateInsurance() {
        return insurance;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy No: " + insurancePolicyNumber;
    }

    public void showInsuranceCost() {
        System.out.println("Insurance cost: ₹" + calculateInsurance());
        System.out.println(getInsuranceDetails());
    }

    public void showTotalCost(int days) {
        int total = calculateRentalCost(days) + calculateInsurance();
        System.out.println("Total cost (Rental + Insurance): ₹" + total);
        System.out.println();
    }
}


class Truck extends Vehicle  {
    private String insurancePolicyNumber;
    int insurance;

    public Truck(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber,int insurance) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insurance=insurance;
    }

    @Override
    public int calculateRentalCost(int days) {
        return (days * getRentalRate()) + 3000;
    }

    @Override
    public int calculateInsurance() {
        return insurance;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: " + insurancePolicyNumber;
    }

    public void showInsuranceCost() {
        System.out.println("Insurance cost: ₹" + calculateInsurance());
        System.out.println(getInsuranceDetails());
    }

    public void showTotalCost(int days) {
        int total = calculateRentalCost(days) + calculateInsurance();
        System.out.println("Total cost (Rental + Insurance): ₹" + total);
        System.out.println();
    }
}
