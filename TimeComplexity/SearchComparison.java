import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    public static boolean linearSearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, target) >= 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[1_000_000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = rand.nextInt();

        int target = arr[arr.length - 1];

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1e6 + " ms");
    }
}
