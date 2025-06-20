import java.util.ArrayList;

public class FactorStats {
    public static int[] findFactors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) if (num % i == 0) list.add(i);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static long product(int[] arr) {
        long prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }

    public static double sumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int i : arr) sumSq += Math.pow(i, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        int[] factors = findFactors(12);
        System.out.println("Factors:");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
