import java.util.Scanner;

/**
 * Program DayOfWeek that takes a date as input and prints the day of the week (0=Sunday, 1=Monday, ...).
 */
public class DayOfWeek {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for month, day, year
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Zeller's congruence for Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31*m0)/12) % 7;
        System.out.println("Day of week (0=Sunday, 1=Monday, ..., 6=Saturday): " + dayOfWeek);
        scanner.close();
    }
}
