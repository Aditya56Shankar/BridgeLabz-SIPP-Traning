import java.util.Scanner;

/**
 * Program to count down from user input value to 1 using a for loop (rocket launch countdown).
 */
public class CountdownForLoop {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for counter
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print current counter value
        }
        System.out.println("Rocket Launched!");
        
        // Close the scanner
        scanner.close();
    }
}
