import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = i;

        Set<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : arr) {
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        boolean found = false;
        for (int val : arr) {
            if (val == target) {
                found = true;
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1e6 + " ms");
    }
}
