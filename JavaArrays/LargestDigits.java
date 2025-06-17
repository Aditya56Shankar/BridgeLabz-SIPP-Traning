import java.util.*;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            if (index == maxDigit) {
                maxDigit *= 2;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = digit;
            number /= 10;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
