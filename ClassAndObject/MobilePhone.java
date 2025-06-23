import java.util.Scanner;

class MobilePhoneDetails {
    String brand;
    String model;
    double price;

    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        MobilePhoneDetails phone = new MobilePhoneDetails(brand, model, price);
        phone.displayDetails();
    }
}
