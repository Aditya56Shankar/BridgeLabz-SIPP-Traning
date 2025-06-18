import java.util.Scanner;

public class SubString {
    public static String substring(String s,int start,int end){
        if(start<=0||end>s.length()){
            int n=s.length();
            System.out.println("enter index from 0 to"+n);
        }
        String s1="";
        for(int i=start-1;i<end;i++){
            s1+=s.charAt(i);
        }
        return s1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start= sc.nextInt();
        int end=sc.nextInt();

        System.out.println(substring(s,start,end));
    }
}
