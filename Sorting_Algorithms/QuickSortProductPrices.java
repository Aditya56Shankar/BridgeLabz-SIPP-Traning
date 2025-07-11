public class SelectionSortExamScores {

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;                       // assume first unsorted is min
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            swap(arr, i, minIdx);                 // put real min at position i
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] scores = {72, 88, 65, 91, 79, 84, 70};
        selectionSort(scores);
        System.out.print("Sorted exam scores: ");
        for (int s : scores) System.out.print(s + " ");
    }
}
