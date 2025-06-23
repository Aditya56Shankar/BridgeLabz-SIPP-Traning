import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public static boolean isPalindrome(String n) {
    for (int i = 0; i < n.length() / 2; i++) {
        if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
            return false; 
        }
    }
    return true; 
}


    public void displayResult() {
        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
    }
}
