import java.time.LocalDate;





public class Order{
    String OrderId;

    LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        OrderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Created";
    }
    public void displayOrderInfo() {
        System.out.println("Order ID: " + OrderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }

}

class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
    public void displayOrderInfo() {
        System.out.println("Order ID: " + OrderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }

}

class DeliveredOrder extends ShippedOrder{
    LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + OrderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}