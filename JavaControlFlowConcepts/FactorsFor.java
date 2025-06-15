import java.util.Scanner;

/**
 * Program to find the factors of a number using a for loop.
 */
public class FactorsFor {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Factors of " + number + ":");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
