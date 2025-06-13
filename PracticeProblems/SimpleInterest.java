import java.util.*;
public class SimpleInterest{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		float si=(p*r*t)/100f;
		System.out.printf("simple interest: %.2f\n", si);
	}

}
