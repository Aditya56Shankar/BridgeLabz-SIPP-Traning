import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();
    }
}
