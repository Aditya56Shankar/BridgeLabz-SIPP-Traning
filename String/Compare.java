import java.util.Scanner;

public class Compare {
    public static boolean compare(String s1,String s2){

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2=sc.next();
        System.out.println(compare(s1,s2));
        System.out.println(s1.equals(s2));
    }
}
