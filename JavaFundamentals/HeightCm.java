import java.util.*;
public class HeightCm{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		double inch=(double)h/2.54;
		double foot=inch/12;
		System.out.println("Your Height in cm is "+h+ " while in feet is "+foot+ " and inches is "+inch);
	
	
	}

}