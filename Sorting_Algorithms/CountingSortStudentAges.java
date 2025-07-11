public class CountingSortStudentAges {

    private static void countingSort(int[] ages, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // 1. frequency count
        for (int age : ages) count[age - min]++;

        // 2. cumulative count
        for (int i = 1; i < range; i++) count[i] += count[i - 1];

        // 3. build output (traverse input right‑to‑left for stability)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[--count[age - min]] = age;
        }

        // 4. copy back
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 17, 11, 15, 18, 12, 14, 10, 16, 13};
        countingSort(ages, 10, 18);
        System.out.print("Sorted student ages: ");
        for (int a : ages) System.out.print(a + " ");
    }
}
