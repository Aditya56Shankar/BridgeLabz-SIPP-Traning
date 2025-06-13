import java.util.*;
public class Km_To_Miles
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the kilometer: ");
		int km = sc.nextInt();

		double miles = km * 0.621371 ;
		System.out.print(miles);
		
	}
}