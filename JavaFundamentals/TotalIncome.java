import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        double income = salary + bonus;

        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f\n",
                          salary, bonus, income);
    }
}
