import java.util.Scanner;

/**
 * Program to check whether a person can vote based on age.
 */
public class VoteEligibility {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();
        
        // Check if age is 18 or older
        if (age >= 18) {
            // Print eligible to vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Print not eligible to vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
