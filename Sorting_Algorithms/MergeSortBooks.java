public class MergeSortBooks {
    public static void main(String[] args) {
        int[] prices = {400, 200, 150, 300, 250};
        mergeSort(prices, 0, prices.length - 1);
        System.out.print("Sorted Book Prices: ");
        for (int price : prices) System.out.print(price + " ");
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];
        for (int i = 0; i < left.length; i++) left[i] = arr[l + i];
        for (int j = 0; j < right.length; j++) right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
