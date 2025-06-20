public class QuadraticRoots {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double sqrt = Math.sqrt(delta);
            return new double[]{(-b + sqrt) / (2 * a), (-b - sqrt) / (2 * a)};
        }
    }

    public static void main(String[] args) {
        double[] roots = findRoots(1, -3, 2);
        if (roots.length == 0) System.out.println("No Real Roots");
        else for (double r : roots) System.out.println("Root: " + r);
    }
}
