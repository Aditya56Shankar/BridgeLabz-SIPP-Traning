public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 1001);
        Product p2 = new Product("Smartphone", 25000, 2, 1002);
	p1.displayDetails();
	Product.updateDiscount(50);
	p1.displayDetails();


    }
}
class Product {
    static double discount = 0;
    String productName;
    double price;
    int quantity;
    final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount );
    }
}