import java.util.Scanner;

/**
 * Program to find the sum of n natural numbers using while loop and compare with formula.
 */
public class SumNaturalNumbersWhileComparison {
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
            // Calculate sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= number) {
                loopSum += i;
                i++;
            }
            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
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
