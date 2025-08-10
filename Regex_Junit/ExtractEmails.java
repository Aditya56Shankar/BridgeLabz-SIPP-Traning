import java.util.regex.*;
import java.util.Scanner;
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Matcher m = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}