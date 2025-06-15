import java.util.Scanner;

/**
 * Program to find the factorial of an integer using a while loop.
 */
public class FactorialWhile {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;
            int i = 1;
            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }
            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}
