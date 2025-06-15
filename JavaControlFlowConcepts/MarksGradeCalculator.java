import java.util.Scanner;

/**
 * Program to input marks for 3 subjects, compute percentage and grade.
 */
public class MarksGradeCalculator {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for marks
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = total / 3.0;
        String grade;
        String remarks;
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Above Average";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.printf("Average Mark: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        scanner.close();
    }
}
