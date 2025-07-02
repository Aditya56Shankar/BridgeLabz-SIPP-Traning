public class EcommercePlatform {
    public static void main(String[] args) {
        Product e = new Electronics(101, "Laptop", 50000, 18, 10);
        Product c = new Clothing(201, "Shirt", 2000, 12, 5);
        Product g = new Groceries(301, "Rice", 1000, 0, 2);

        System.out.println("Final Price: " + e.finalPrice());
        System.out.println("Final Price: " + c.finalPrice());
        System.out.println("Final Price: " + g.finalPrice());
    }
}

interface Taxable {
    int calculateTax();
    int getTaxDetails();
}

abstract class Product implements Taxable {
    int productId;
    String name;
    int price;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract int calculateDiscount();
    abstract int finalPrice();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Electronics extends Product {
    int discount;
    int tax;

    public Electronics(int productId, String name, int price, int tax, int discount) {
        super(productId, name, price);
        this.tax = tax;
        this.discount = discount;
    }

    @Override
    public int calculateDiscount() {
        return (int) (getPrice() * discount / 100.0);
    }

    @Override
    public int calculateTax() {
        return (int) (getPrice() * tax / 100.0);
    }

    @Override
    public int getTaxDetails() {
        return tax;
    }

    public int finalPrice() {
        
        int total = getPrice() + calculateTax() - calculateDiscount();
        
        
        return total;
    }
}

class Clothing extends Product {
    int discount;
    int tax;

    public Clothing(int productId, String name, int price, int tax, int discount) {
        super(productId, name, price);
        this.tax = tax;
        this.discount = discount;
    }

    @Override
    public int calculateDiscount() {
        return (int) (getPrice() * discount / 100.0);
    }

    @Override
    public int calculateTax() {
        return (int) (getPrice() * tax / 100.0);
    }

    @Override
    public int getTaxDetails() {
        return tax;
    }

    public int finalPrice() {
        int total = getPrice() + calculateTax() - calculateDiscount();
        return total;
    }
}

class Groceries extends Product {
    int discount;
    int tax;

    public Groceries(int productId, String name, int price, int tax, int discount) {
        super(productId, name, price);
        this.tax = tax;
        this.discount = discount;
    }

    @Override
    public int calculateDiscount() {
        return (int) (getPrice() * discount / 100.0);
    }

    @Override
    public int calculateTax() {
        return (int) (getPrice() * tax / 100.0);
    }

    @Override
    public int getTaxDetails() {
        return tax;
    }

    public int finalPrice() {
        int total = getPrice() + calculateTax() - calculateDiscount();
        return total;
    }
}
