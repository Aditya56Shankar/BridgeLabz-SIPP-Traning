public class InsertionSortIDs {
    public static void main(String[] args) {
        int[] ids = {104, 102, 101, 105, 103};
        insertionSort(ids);
        System.out.print("Sorted Employee IDs: ");
        for (int id : ids) System.out.print(id + " ");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; j--;
            }
            arr[j + 1] = key;
        }
    }
}
