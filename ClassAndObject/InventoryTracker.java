import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails(int quantity) {
        double totalCost = price * quantity;

        System.out.println("Code     : " + itemCode);
        System.out.println("Name     : " + itemName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(code, name, price);
        item.displayDetails(quantity);
    }
}
