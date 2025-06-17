import java.util.*;

public class TwoToOne{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();

int [][] two=new int [n][m];
int [] one=new int[n*m];

for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
	two[i][j]=sc.nextInt();
}
}

int k=0;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
one[k++]=two[i][j];

}}

for(int i=0;i<n*m;i++){
System.out.println(one[i]);
}
	}
}