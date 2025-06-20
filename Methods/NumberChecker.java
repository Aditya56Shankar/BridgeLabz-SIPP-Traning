import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = arr.clone();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 1210;
        System.out.println("Count: " + countDigits(num));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Duck Number: " + isDuckNumber(num));
    }
}
