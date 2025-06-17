import java.util.*;

public class Height{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		double [] height=new double[11];
		for(int i=0;i<11;i++){
			height[i]=sc.nextDouble();
		}
		double avg =0;
		for(int i=0;i<11;i++){
			avg+=height[i];
		}
		System.out.println(avg/11);
	}
}