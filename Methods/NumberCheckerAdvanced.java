public class NumberCheckerAdvanced {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int i : d) sum += Math.pow(i, d.length);
        return sum == n;
    }

    public static int[] findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        int[] minmax = findMinMax(digits);
        System.out.println("Duck: " + isDuck(num));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Smallest digit: " + minmax[0]);
        System.out.println("Largest digit: " + minmax[1]);
    }
}
