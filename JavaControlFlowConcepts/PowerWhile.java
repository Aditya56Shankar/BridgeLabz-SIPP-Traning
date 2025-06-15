import java.util.Scanner;

/**
 * Program to find the power of a number using a while loop.
 */
public class PowerWhile {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for base and exponent
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
        scanner.close();
    }
}
