import java.util.Scanner;
class NumberOfGoodPairs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] A=new int[n];
	int count=0;
	for(int i=0; i<n; i++)A[i]=sc.nextInt();
	for(int i=0; i<n; i++)
	{
		for(int j=i+1; j<n; j++)
		{
			if(A[i]==A[j] && i<j)count++; 
			//System.out.print("(" +i +"," +j +")");
		}
	}
	System.out.println(count);
}
}