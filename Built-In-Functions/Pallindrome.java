import java.util.Scanner;

public class Pallindrome {
    public static boolean pall(String n){
        for (int i=0;i<(n.length())/2;i++){
            if (n.charAt(i) == n.charAt(n.length()-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n =sc.nextLine();
        System.out.println(pall(n));;
    }
}
