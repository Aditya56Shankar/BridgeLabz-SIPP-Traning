// Ticket Class (Encapsulation)
class Ticket {
    private String movieName;
    private String seatNo;
    private double price;
    private boolean booked;

    public Ticket(String movieName, String seatNo, double price) {
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.price = price;
        this.booked = true;
    }

    public void cancel() {
        booked = false;
        System.out.println("Ticket for " + movieName + " at seat " + seatNo + " cancelled.");
    }

    public boolean isBooked() {
        return booked;
    }

    public String getSeatNo() {
        return seatNo;
    }
}

// Theatre Class (Composition: manages Ticket objects)
class Theatre {
    private String name;
    private List<Ticket> tickets = new ArrayList<>();

    public Theatre(String name) {
        this.name = name;
    }

    public Ticket bookTicket(String movieName, String seatNo, double price) {
        // check if seat is already booked
        for(Ticket t : tickets) {
            if(t.getSeatNo().equals(seatNo) && t.isBooked()) {
                System.out.println("Seat " + seatNo + " is already booked!");
                return null;
            }
        }
        Ticket newTicket = new Ticket(movieName, seatNo, price);
        tickets.add(newTicket);
        System.out.println("Ticket booked: " + movieName + ", Seat: " + seatNo);
        return newTicket;
    }

    public void cancelTicket(Ticket ticket) {
        if(ticket != null && ticket.isBooked()) {
            ticket.cancel();
        } else {
            System.out.println("Ticket not valid for cancellation.");
        }
    }
}

// Customer Class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void bookMovie(Theatre theatre, String movie, String seat, double price) {
        theatre.bookTicket(movie, seat, price);
    }

    public void cancelBooking(Theatre theatre, Ticket ticket) {
        theatre.cancelTicket(ticket);
    }
}

// Example Run
public class MovieBookingSystem {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("PVR");
        Customer ravi = new Customer("Ravi");

        Ticket t1 = theatre.bookTicket("Avengers: Endgame", "A12", 250.0);
        ravi.cancelBooking(theatre, t1);
    }
}
