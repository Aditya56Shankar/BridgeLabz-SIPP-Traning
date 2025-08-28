import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;
    String type; // "normal" or "emergency"

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

public class CallCenter {
    private Queue<Customer> normalQueue;
    private Queue<Customer> emergencyQueue;

    public CallCenter() {
        normalQueue = new LinkedList<>();
        emergencyQueue = new LinkedList<>();
    }

    // Add customer to the right queue
    public void enqueue(Customer customer) {
        if (customer.type.equalsIgnoreCase("emergency")) {
            emergencyQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }
        System.out.println(customer.name + " added to " + customer.type + " queue");
    }

    // Serve next customer
    public void dequeue() {
        if (!emergencyQueue.isEmpty()) {
            Customer c = emergencyQueue.poll();
            System.out.println("Serving Emergency Customer: " + c.name);
        } else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Serving Normal Customer: " + c.name);
        } else {
            System.out.println("No customers waiting");
        }
    }

    // Main to test
    public static void main(String[] args) {
        CallCenter center = new CallCenter();

        center.enqueue(new Customer("Alice", "normal"));
        center.enqueue(new Customer("Bob", "emergency"));
        center.enqueue(new Customer("Charlie", "normal"));

        center.dequeue(); // Bob (emergency)
        center.dequeue(); // Alice
        center.dequeue(); // Charlie
        center.dequeue(); // No customers waiting
    }
}
 {
    
}
