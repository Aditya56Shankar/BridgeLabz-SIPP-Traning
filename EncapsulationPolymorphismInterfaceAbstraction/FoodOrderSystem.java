abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.9; // 10% discount
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity + 20; // extra charge for non-veg
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.85; // 15% discount
    }

    public String getDiscountDetails() {
        return "15% discount on Non-Veg Item";
    }
}

public class FoodOrderSystem {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Curry", 300, 1);

        System.out.println(veg.getItemDetails());
        System.out.println("Total Price (without discount): ₹" + veg.calculateTotalPrice());
        System.out.println(veg.getDiscountDetails());
        System.out.println("Total Price (after discount): ₹" + veg.applyDiscount());
        System.out.println();

        System.out.println(nonVeg.getItemDetails());
        System.out.println("Total Price (without discount): ₹" + nonVeg.calculateTotalPrice());
        System.out.println(nonVeg.getDiscountDetails());
        System.out.println("Total Price (after discount): ₹" + nonVeg.applyDiscount());
    }
}
