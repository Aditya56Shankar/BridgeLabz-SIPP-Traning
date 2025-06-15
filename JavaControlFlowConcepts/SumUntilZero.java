import java.util.Scanner;

/**
 * Program to find the sum of numbers until the user enters 0.
 */
public class SumUntilZero {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum
        double value; // Variable to store user input
        
        // Loop until user enters 0
        while (true) {
            // User input
            System.out.print("Enter a number (0 to stop): ");
            value = scanner.nextDouble();
            if (value == 0)
                break;
            // Add value to total
            total += value;
        }
        // Print the total sum
        System.out.println("Total sum is: " + total);
        
        // Close the scanner
        scanner.close();
    }
}
