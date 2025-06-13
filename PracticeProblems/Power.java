import java.util.*;
public class Power
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the base: ");
		int a = sc.nextInt();

		System.out.print("enter the exponent: ");
		int b = sc.nextInt();

		int result = (int)Math.pow(a,b);

		System.out.print(result);		
	}
}