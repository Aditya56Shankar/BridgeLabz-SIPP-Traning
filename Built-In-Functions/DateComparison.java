import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String input1 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(input1, form);

        
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String input2 = sc.nextLine();
        LocalDate date2 = LocalDate.parse(input2, form);

       
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }

        
    }
}
