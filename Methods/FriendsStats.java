public class FriendsStats {
    public static int findYoungest(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIdx]) minIdx = i;
        return minIdx;
    }

    public static int findTallest(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIdx]) maxIdx = i;
        return maxIdx;
    }

    public static void main(String[] args) {
        int[] ages = {22, 25, 21};
        double[] heights = {170.5, 165.3, 180.0};
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
}
