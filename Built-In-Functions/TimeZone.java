import java.time.ZonedDateTime;
import java.time.ZoneId;


public class TimeZone {
    public static void main(String[] args) {
        

        
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmt);

        
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
	System.out.println("Current time in IST: " + pst);
    }
}
