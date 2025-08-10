import java.util.Scanner;
public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] badWords = {"damn", "stupid"};
        for(String word : badWords) text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        System.out.println(text);
    }
}