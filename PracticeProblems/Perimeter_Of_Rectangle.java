import java.util.*;
public class Perimeter_Of_Rectangle
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length: ");
		int length = sc.nextInt();
		System.out.print("enter the width: ");
		int width = sc.nextInt();
		int perimeter = 2*(length + width);
		System.out.print(perimeter);
		
	}
}