public class TriangleRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        System.out.println("Rounds needed: " + calculateRounds(100, 120, 80));
    }
}
