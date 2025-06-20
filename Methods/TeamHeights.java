public class TeamHeights {
    public static int[] generateHeights() {
        int[] h = new int[11];
        for (int i = 0; i < 11; i++)
            h[i] = 150 + (int)(Math.random() * 101);
        return h;
    }

    public static int sum(int[] h) {
        int s = 0;
        for (int i : h) s += i;
        return s;
    }

    public static int min(int[] h) {
        int m = h[0];
        for (int i : h) if (i < m) m = i;
        return m;
    }

    public static int max(int[] h) {
        int m = h[0];
        for (int i : h) if (i > m) m = i;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights:");
        for (int h : heights) System.out.print(h + " ");
        System.out.printf("\nMean: %.2f\n", sum(heights) / 11.0);
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}
