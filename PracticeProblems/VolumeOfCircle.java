import java.util.*;
public class VolumeOfCircle{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		float volume=(float)Math.PI*r*r*h;
		System.out.printf("volume: %.2f\n", volume);
	}

}
