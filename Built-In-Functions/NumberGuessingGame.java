import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-100");
        int num = sc.nextInt();
        Random random = new Random();
        int guess  = random.nextInt(100);
        System.out.println(guess);

        if(guess<num){
            System.out.println("Guessed number is smaller than the user entered number");
        }
        else if(guess>num){
            System.out.println("Guessed number is greater than the user entered number");
        }
        else{
            System.out.println("Guessed number is equal to user entered number");
        }
        sc.close();

    }
}
