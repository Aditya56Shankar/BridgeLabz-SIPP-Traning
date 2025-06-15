import java.util.Scanner;

/**
 * Program to find the sum of n natural numbers using for loop and compare with formula.
 */
public class SumNaturalNumbersComparison {
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
        
        // Check if the number is a natural number
        if (number > 0) {
            // Calculate sum using formula
            int formulaSum = number * (number + 1) / 2;
            // Calculate sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }
            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        } else {
            // Print not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the scanner
        scanner.close();
    }
}
