import java.util.Scanner;

/**
 * Program to count down from user input value to 1 using a while loop (rocket launch countdown).
 */
public class CountdownWhileLoop {
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
        
        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter); // Print current counter value
            counter--;
        }
        System.out.println("Rocket Launched!");
        
        // Close the scanner
        scanner.close();
    }
}
