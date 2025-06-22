import java.util.Scanner;

public class ThreeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = takeInput(sc);
        int num2 = takeInput(sc);
        int num3 = takeInput(sc);

        int max = findMaximum(num1, num2, num3);

        System.out.println("The maximum number is: " + max);

        
    }

    public static int takeInput(Scanner sc) {
        
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
