import java.util.Scanner;

/**
 * Program to check for natural number and write the sum of n natural numbers.
 */
public class SumOfNaturalNumbers {
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
        
        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate sum using formula
            int sum = number * (number + 1) / 2;
            // Print the sum
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Print not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the scanner
        scanner.close();
    }
}
