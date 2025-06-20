public class HarshadAnalyzer {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) {
            res[i][0] = i;
            res[i][1] = freq[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 18;
        System.out.println("Sum: " + sumDigits(num));
        System.out.println("Squares: " + sumOfSquares(num));
        System.out.println("Harshad: " + isHarshad(num));
        int[][] freq = digitFrequency(num);
        for (int[] f : freq) if (f[1] > 0)
            System.out.println("Digit " + f[0] + " => " + f[1] + " times");
    }
}
