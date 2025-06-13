import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("The maximum number of handshakes among %d students is %d\n",
                          numberOfStudents, maxHandshakes);
    }
}
