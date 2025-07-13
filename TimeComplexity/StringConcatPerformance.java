public class StringConcatPerformance {
    public static void main(String[] args) {
        int n = 10000;

        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) str += "a";
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1e6 + " ms");
    }
}
