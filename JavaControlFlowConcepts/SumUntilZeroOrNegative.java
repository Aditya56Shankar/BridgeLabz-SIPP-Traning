import java.util.Scanner;

/**
 * Program to find the sum until user enters 0 or a negative number using while loop and break statement.
 */
public class SumUntilZeroOrNegative {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum
        double value; // Variable to store user input
        
        // Infinite loop
        while (true) {
            // User input
            System.out.print("Enter a number (0 or negative to stop): ");
            value = scanner.nextDouble();
            // Break if value is 0 or negative
            if (value <= 0)
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
