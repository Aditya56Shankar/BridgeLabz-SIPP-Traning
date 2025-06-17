import java.util.*;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Number " + num + " is ");
            
            if (num > 0) {
                System.out.print("positive and ");
                if (num % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (num < 0) {
                System.out.println("negative.");
            } else {
                System.out.println("zero.");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nComparison between first and last element:");
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
    }
}
