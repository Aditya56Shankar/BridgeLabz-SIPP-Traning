import java.util.Scanner;

/**
 * Program to check if the first, second, or third number is the largest of the three.
 */
public class LargestOfThree {
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

        // Check which is the largest
        boolean firstLargest = (number1 >= number2) && (number1 >= number3);
        boolean secondLargest = (number2 >= number1) && (number2 >= number3);
        boolean thirdLargest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        scanner.close();
    }
}
