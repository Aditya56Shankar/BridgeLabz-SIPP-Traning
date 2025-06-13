import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("The %.2f celsius is %.2f fahrenheit\n", celsius, fahrenheit);
    }
}
