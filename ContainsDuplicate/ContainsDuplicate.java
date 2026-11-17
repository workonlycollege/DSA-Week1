import java.util.Scanner;
class ContainsDuplicate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] A=new int[n];
	Boolean repeat=false;
	for(int i=0; i<n; i++)A[i]=sc.nextInt();
	System.out.println("Array: ");
	for(int i=0; i<n; i++)System.out.print(A[i] +" ");
	for(int i=0; i<n; i++)
	{
		for(int j=i+1; j<n; j++)
		{
			if(A[i]==A[j])
			{
				repeat=true;
				break;
			}
		}
		if(repeat)break;
	}
	System.out.println("\nDublicate: ");
	System.out.println(repeat);
}
}