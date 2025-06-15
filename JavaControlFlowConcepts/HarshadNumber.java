import java.util.Scanner;

/**
 * Program to check if a number is a Harshad Number.
 */
public class HarshadNumber {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        int n = Math.abs(number);
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum != 0 && n % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
        scanner.close();
    }
}
