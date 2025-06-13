import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The %.2f fahrenheit is %.2f celsius\n", fahrenheit, celsius);
    }
}
