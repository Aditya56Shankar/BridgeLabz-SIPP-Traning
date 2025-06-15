import java.util.Scanner;

/**
 * Program to count the number of digits in an integer.
 */
public class DigitCount {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) count = 1;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
