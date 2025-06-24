class ProductInventoryDetails {
    private String productName;
    private int price;
    private static int totalProducts = 0;

    public ProductInventoryDetails(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
public class ProductInventory {

    public static void main(String[] args) {
        ProductInventoryDetails p1 = new ProductInventoryDetails("Laptop", 75000);
        ProductInventoryDetails p2 = new ProductInventoryDetails("Smartphone", 35000);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        p1.displayTotalProducts();
    }
}
