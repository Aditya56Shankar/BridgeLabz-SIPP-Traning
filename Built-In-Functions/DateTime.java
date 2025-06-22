import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        DateTimeFormatter form1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter form2=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter form3=DateTimeFormatter.ofPattern("EEE MMM dd, yyyy");

        LocalDate date=LocalDate.now();
        System.out.println(date.format(form1));
        System.out.println(date.format(form2));
        System.out.println(date.format(form3));
    }
}
