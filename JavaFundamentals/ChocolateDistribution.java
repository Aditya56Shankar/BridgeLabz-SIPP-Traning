import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        int eachChildGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d\n",
                          eachChildGets, remaining);
    }
}
