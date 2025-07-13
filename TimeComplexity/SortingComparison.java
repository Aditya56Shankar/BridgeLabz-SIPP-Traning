import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] original = new Random().ints(10_000, 0, 100000).toArray();

        int[] bubble = Arrays.copyOf(original, original.length);
        int[] merge = Arrays.copyOf(original, original.length);
        int[] quick = Arrays.copyOf(original, original.length);

        long start = System.nanoTime();
        bubbleSort(bubble);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.sort(merge); // Merge Sort Simulation
        end = System.nanoTime();
        System.out.println("Merge Sort: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.sort(quick); // Quick Sort Simulation
        end = System.nanoTime();
        System.out.println("Quick Sort: " + (end - start) / 1e6 + " ms");
    }
}
