public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Tablet"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        Storage.displayItems(electronicStorage.getItems());

        System.out.println("Furniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private java.util.List<T> items = new java.util.ArrayList<>();
    void addItem(T item) { items.add(item); }
    java.util.List<T> getItems() { return items; }
    static void displayItems(java.util.List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items)
            System.out.println(item);
    }
}