import java.util.Scanner;

/**
 * Program to print odd and even numbers between 1 and the number entered by the user.
 */
public class OddEvenNumbers {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        scanner.close();
    }
}
