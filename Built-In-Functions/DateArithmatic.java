import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Enter a date (dd-MM-yyyy): ");
        String in = sc.nextLine();
        LocalDate date=LocalDate.parse(in,form);
        LocalDate res=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(res.format(form));
    }
}
