import java.util.Scanner;

/**
 * Program to find all the multiples of a number below 100 using a for loop backwards.
 */
public class MultiplesBelow100For {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for number
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input. Number must be positive and less than 100.");
        }
        scanner.close();
    }
}
