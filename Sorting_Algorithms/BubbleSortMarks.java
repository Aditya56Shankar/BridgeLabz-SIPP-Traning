public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {88, 76, 90, 85, 70};
        bubbleSort(marks);
        System.out.print("Sorted Marks: ");
        for (int mark : marks) System.out.print(mark + " ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
