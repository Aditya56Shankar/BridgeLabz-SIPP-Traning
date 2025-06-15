import java.util.Scanner;

/**
 * Program to print the greatest factor of a number beside itself using a while loop.
 */
public class GreatestFactorWhile {
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
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        scanner.close();
    }
}
