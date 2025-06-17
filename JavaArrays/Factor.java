import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxFactor = 10;
        int[] arr = new int[maxFactor];
        int k = 0;

        for (int i = 1; i <= n; i++) { 
            if (n % i == 0) {
                
                if (k == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < arr.length; j++) {
                        temp[j] = arr[j];
                    }
                    arr = temp;
                }
                arr[k++] = i;
            }
        }

       
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
