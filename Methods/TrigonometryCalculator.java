public class TrigonometryCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        double[] results = calculateTrigonometricFunctions(45); // example
        System.out.printf("Sin: %.4f, Cos: %.4f, Tan: %.4f\n", results[0], results[1], results[2]);
    }
}
