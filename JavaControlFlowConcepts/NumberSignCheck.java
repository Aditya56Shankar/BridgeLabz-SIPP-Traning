import java.util.Scanner;

/**
 * Program to check whether a number is positive, negative, or zero.
 */
public class NumberSignCheck {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
