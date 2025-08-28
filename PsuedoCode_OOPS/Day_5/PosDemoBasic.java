import java.util.*;

// ---- Tax Interface ----
interface TaxCalculator {
    double calculate(double price);
}

// ---- Concrete Tax Classes ----
class FoodTax implements TaxCalculator {
    public double calculate(double price) {
        return price * 0.05; // 5%
    }
}

class BeverageTax implements TaxCalculator {
    public double calculate(double price) {
        return price * 0.12; // 12%
    }
}

class ImportedTax implements TaxCalculator {
    public double calculate(double price) {
        return (price * 0.05) + (price * 0.10); // 5% GST + 10% Customs
    }
}

// ---- Discount Interface ----
interface DiscountPolicy {
    double apply(double amount);
}

// ---- Concrete Discount Classes ----
class NoDiscount implements DiscountPolicy {
    public double apply(double amount) {
        return amount;
    }
}

class FlatDiscount implements DiscountPolicy {
    public double apply(double amount) {
        return amount - 100;
    }
}

class PercentageDiscount implements DiscountPolicy {
    public double apply(double amount) {
        return amount * 0.90; // 10% off
    }
}

// New: Buy 1 Get 1 (basic version: halves the bill)
class BogoDiscount implements DiscountPolicy {
    public double apply(double amount) {
        return amount / 2; 
    }
}

// ---- Item Class ----
class Item {
    String name;
    double price;
    TaxCalculator tax;

    Item(String name, double price, TaxCalculator tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    double getTotal() {
        return price + tax.calculate(price);
    }
}

// ---- Bill Class ----
class Bill {
    List<Item> items = new ArrayList<>();
    DiscountPolicy discount;

    Bill(DiscountPolicy discount) {
        this.discount = discount;
    }

    void addItem(Item item) {
        items.add(item);
    }

    void printBill() {
        double subtotal = 0;
        for (Item i : items) {
            double total = i.getTotal();
            subtotal += total;
            System.out.println(i.name + " => ₹" + total);
        }
        System.out.println("Subtotal: ₹" + subtotal);
        double finalAmount = discount.apply(subtotal);
        System.out.println("Discount Applied: " + discount.getClass().getSimpleName());
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}

// ---- Demo ----
public class PosDemoBasic {
    public static void main(String[] args) {
        // Scenario 1
        Bill bill1 = new Bill(new PercentageDiscount());
        bill1.addItem(new Item("Paneer Tikka", 300, new FoodTax()));
        bill1.addItem(new Item("Coke", 80, new BeverageTax()));
        bill1.addItem(new Item("Imported Cheese", 500, new ImportedTax()));
        System.out.println("Scenario 1:");
        bill1.printBill();

        // Scenario 2: New BOGO discount
        Bill bill2 = new Bill(new BogoDiscount());
        bill2.addItem(new Item("Coke", 80, new BeverageTax()));
        bill2.addItem(new Item("Coke", 80, new BeverageTax()));
        System.out.println("\nScenario 2:");
        bill2.printBill();
    }
}
