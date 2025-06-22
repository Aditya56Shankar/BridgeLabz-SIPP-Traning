import java.util.Scanner;

public class GcdLcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();


        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));


    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }


    public static int lcm(int a, int b) {
        int ans = (a > b) ? a : b;


        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        return ans;
    }
}
