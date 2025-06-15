import java.util.Scanner;

/**
 * Program to print the greatest factor of a number beside itself using a for loop.
 */
public class GreatestFactorFor {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        scanner.close();
    }
}
