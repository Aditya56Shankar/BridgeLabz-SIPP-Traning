import java.util.*;

public class OddEven{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []odd=new int[(n/2)+1];
		int []even=new int[(n/2)+1];
		int o=0;
		int e=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				even[e++]=i;
			}
			else{
				
				odd[o++]=i;
			}
		}
System.out.println("even array: ");
		for(int i=0;i<(n/2)+1;i++){
			
			System.out.print(even[i]+", ");
		}
		System.out.println();
System.out.print("odd array: ");
		for(int i=0;i<(n/2)+1;i++){
			System.out.print(odd[i]+", ");
		}
			
	}
}