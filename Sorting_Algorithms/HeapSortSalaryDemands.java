public class HeapSortSalaryDemands {

    private static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);        // move current root (max) to end
            heapify(arr, i, 0);     // heapify reduced heap
        }
    }

    private static void heapify(int[] arr, int heapSize, int root) {
        int largest = root;
        int left  = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < heapSize && arr[left] > arr[largest])  largest = left;
        if (right < heapSize && arr[right] > arr[largest]) largest = right;

        if (largest != root) {
            swap(arr, root, largest);
            heapify(arr, heapSize, largest);   // recursively heapify affected sub‑tree
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] salaryDemands = {55000, 42000, 63000, 48000, 60000, 51000};
        heapSort(salaryDemands);
        System.out.print("Sorted salary demands: ");
        for (int s : salaryDemands) System.out.print(s + " ");
    }
}
