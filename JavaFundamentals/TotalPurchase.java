import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and the unit price is INR %.2f\n",
                          totalPrice, quantity, unitPrice);
    }
}
