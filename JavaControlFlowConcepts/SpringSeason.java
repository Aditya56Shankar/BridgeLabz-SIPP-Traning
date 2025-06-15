import java.util.Scanner;

/**
 * Program SpringSeason that checks if a given date is in Spring Season (March 20 to June 20).
 */
public class SpringSeason {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for month and day
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Check for Spring Season
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        scanner.close();
    }
}
