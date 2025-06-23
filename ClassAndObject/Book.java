import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String title = sc.nextLine();

        String author = sc.nextLine();

        
        double price = sc.nextDouble();

        BookDetails book = new BookDetails(title, author, price);
        book.displayDetails();
    }
}
class BookDetails{
    String title;
    String author;
    double price;

    // Constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {

        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
