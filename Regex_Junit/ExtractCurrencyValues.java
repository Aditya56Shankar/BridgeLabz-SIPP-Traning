import java.util.regex.*;
import java.util.Scanner;
public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}