import java.util.Scanner;
class MissingNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] A=new int[n];
	int sum=0;
	for(int i=0; i<A.length; i++)
	{
		A[i]=sc.nextInt();
		sum+=A[i];
	}
	int total=n*(n+1)/2;
	int missing=total-sum;
	System.out.println("Missing: " +missing);
}
}