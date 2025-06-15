import java.util.Scanner;

/**
 * Program to check if a number is divisible by 5.
 */
public class DivisibleBy5 {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility by 5
        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        scanner.close();
    }
}
