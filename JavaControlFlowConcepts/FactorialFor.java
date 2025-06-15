import java.util.Scanner;

/**
 * Program to find the factorial of an integer using a for loop.
 */
public class FactorialFor {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for number
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;
            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
