import java.time.LocalDateTime;

public class TicketReservationSystem {

    class Node {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        LocalDateTime bookingTime;
        Node next;

        public Node(int ticketId, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = this;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int totalTickets = 0;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber) {
        LocalDateTime bookingTime = LocalDateTime.now();
        Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        totalTickets++;
        System.out.println("Ticket booked successfully for " + customerName);
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Node temp = head;
        Node prev = tail;
        boolean found = false;

        do {
            if (temp.ticketId == ticketId) {
                found = true;
                if (head == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                totalTickets--;
                System.out.println("Ticket with ID " + ticketId + " removed.");
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("Ticket ID " + ticketId + " not found.");
        }
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Node temp = head;
        System.out.println("Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomerName(String name) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        boolean found = false;
        Node temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Ticket found: ID " + temp.ticketId +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for customer: " + name);
        }
    }

    public void searchByMovieName(String movie) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        boolean found = false;
        Node temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Ticket found: ID " + temp.ticketId +
                        ", Customer: " + temp.customerName +
                        ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for movie: " + movie);
        }
    }

    public void totalTickets() {
        System.out.println("Total tickets booked: " + totalTickets);
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Alice", "Inception", "A10");
        system.addTicket(102, "Bob", "Interstellar", "B5");
        system.addTicket(103, "Charlie", "Inception", "A11");

        system.displayTickets();

        system.searchByCustomerName("Alice");
        system.searchByMovieName("Inception");

        system.removeTicket(102);
        system.displayTickets();

        system.totalTickets();
    }
}
