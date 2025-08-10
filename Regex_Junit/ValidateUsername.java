import java.util.regex.*;
import java.util.Scanner;
public class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
    }
}