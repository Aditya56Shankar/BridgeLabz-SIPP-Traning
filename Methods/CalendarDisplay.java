import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDisplay {
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && LeapYear.isLeapYear(year)) return 29;
        return days[month - 1];
    }

    public static int getStartDay(int month, int year) {
        Calendar c = new GregorianCalendar(year, month - 1, 1);
        return c.get(Calendar.DAY_OF_WEEK) - 1; // 0=Sunday
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;
        int startDay = getStartDay(month, year);
        int numDays = getDaysInMonth(month, year);

        System.out.printf("   %s %d\n", getMonthName(month), year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < startDay; i++) System.out.print("   ");
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%2d ", day);
            if ((startDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
