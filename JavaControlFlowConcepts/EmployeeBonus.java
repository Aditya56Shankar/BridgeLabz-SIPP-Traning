import java.util.Scanner;

/**
 * Program to find the bonus of employees based on years of service.
 */
public class EmployeeBonus {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for salary and years of service
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        // Calculate bonus if years of service > 5
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
        scanner.close();
    }
}
