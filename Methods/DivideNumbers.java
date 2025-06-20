public class DivideNumbers {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        int[] result = findRemainderAndQuotient(25, 4);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}
