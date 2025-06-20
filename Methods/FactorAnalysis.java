public class FactorAnalysis {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        for (int i = 1, j = 0; i <= n; i++)
            if (n % i == 0) f[j++] = i;
        return f;
    }

    public static int getGreatestFactor(int[] f) {
        int max = f[0];
        for (int i : f) if (i > max) max = i;
        return max;
    }

    public static int sumFactors(int[] f) {
        int sum = 0;
        for (int i : f) sum += i;
        return sum;
    }

    public static long productFactors(int[] f) {
        long prod = 1;
        for (int i : f) prod *= i;
        return prod;
    }

    public static long productOfCubes(int[] f) {
        long prod = 1;
        for (int i : f) prod *= Math.pow(i, 3);
        return prod;
    }

    public static void main(String[] args) {
        int[] factors = findFactors(12);
        System.out.println("Greatest factor: " + getGreatestFactor(factors));
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));
    }
}
