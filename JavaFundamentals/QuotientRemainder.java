import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n",
                          quotient, remainder, number1, number2);
    }
}
