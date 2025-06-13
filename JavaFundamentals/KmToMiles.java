import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
       
        double km;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");

        km = input.nextDouble();  
        double miles = km / 1.6;

        System.out.printf("Distance in miles: %.2f\n", miles);
    }
}
