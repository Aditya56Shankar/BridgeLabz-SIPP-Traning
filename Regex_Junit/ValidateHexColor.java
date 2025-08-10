import java.util.regex.*;
import java.util.Scanner;
public class ValidateHexColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        System.out.println(color.matches("^#[0-9A-Fa-f]{6}$"));
    }
}