import java.util.Scanner;

/**
 * Program to find the factors of a number using a while loop.
 */
public class FactorsWhile {
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
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
