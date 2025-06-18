import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(upper(s));
	
    }


    private static String upper(String s) {
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            s1+=ch;
        }
        return s1;
    }
}
