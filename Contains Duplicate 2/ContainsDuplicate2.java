import java.util.Scanner;
class ContainsDuplicate2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] A=new int[n];
	for(int i=0; i<n; i++)A[i]=sc.nextInt();
	int k=sc.nextInt();
	Boolean output=false;
	for(int i=0; i<n; i++)
	{
		for(int j=i+1; j<n; j++)
		{
			if(A[i]==A[j] && (j-i)<=k)output=true;
		}
		if(output)break;
	}
	System.out.println(output);
}
}