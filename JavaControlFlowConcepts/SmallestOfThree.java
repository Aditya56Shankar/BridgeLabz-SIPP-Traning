import java.util.Scanner;

/**
 * Program to check if the first is the smallest of the 3 numbers.
 */
public class SmallestOfThree {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if first is the smallest
        boolean firstSmallest = (number1 <= number2) && (number1 <= number3);

        System.out.println("Is the first number the smallest? " + firstSmallest);

        scanner.close();
    }
}
