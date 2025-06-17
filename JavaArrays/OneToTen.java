import java.util.*;

public class OneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Enter a number from 1 to 10");
            return;
        }

        int[] t = new int[10];

        for (int i = 0; i < 10; i++) {
            t[i] = n * (i + 1);
            System.out.println( t[i]);
        }
    }
}
