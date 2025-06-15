import java.util.Scanner;

/**
 * Program to create a calculator using switch...case.
 */
public class CalculatorSwitch {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for numbers and operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
        scanner.close();
    }
}
