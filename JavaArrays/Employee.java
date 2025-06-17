import java.util.*;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] empData = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            double salary = sc.nextDouble();
            double service = sc.nextDouble();

            if (salary <= 0 || service < 0) {
                i--;
                continue;
            }

            empData[i][0] = salary;
            empData[i][1] = service;
        }

        for (int i = 0; i < 10; i++) {
            double salary = empData[i][0];
            double service = empData[i][1];
            if (service > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }

            newSalary[i] = salary + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
