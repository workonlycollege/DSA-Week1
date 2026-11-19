import java.util.Scanner;
class TwoSum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); 			    //length of array
	int[] nums=new int[n];
	for(int i=0; i<n; i++)nums[i]=sc.nextInt(); //Input for array
	int target=sc.nextInt(); 		    //target
	boolean found=false;
	for(int i=0; i<nums.length; i++)
	{
		for(int j=0; j<nums.length; j++)
		{
			if(nums[i]+nums[j]==target)
			{
				System.out.println("[" +i +"," +j +"]");
				found=true;
			}
		}
		if(found)break;
	}
	if(!found)System.out.println("Target not there");
}
}