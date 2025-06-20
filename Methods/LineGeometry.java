public class LineGeometry {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        double d = distance(1, 2, 4, 6);
        double[] eq = getLineEquation(1, 2, 4, 6);
        System.out.printf("Distance: %.2f\n", d);
        System.out.printf("Line: y = %.2fx + %.2f\n", eq[0], eq[1]);
    }
}
