public class ArrayAnalyzer {
    public static boolean isPositive(int num) { return num > 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int a, int b) {
        return Integer.compare(a, b); // returns -1, 0, or 1
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, 8, 5, 12};

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                System.out.println(isEven(arr[i]) ? "Even" : "Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int cmp = compare(arr[0], arr[arr.length - 1]);
        System.out.print("Comparison of first and last: ");
        System.out.println(cmp == 0 ? "Equal" : (cmp > 0 ? "Greater" : "Less"));
    }
}
