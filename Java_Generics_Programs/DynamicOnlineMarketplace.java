class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", new BookCategory());
        applyDiscount(book, 10);
        System.out.println(book);
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }
}

class Product<T> {
    private String name;
    private double price = 100;
    private T category;

    Product(String name, T category) {
        this.name = name;
        this.category = category;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String toString() { return name + " - Price: " + price; }
}

class BookCategory {}