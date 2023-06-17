import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];

		System.out.println("Enter "+n+" values in an array : ");
		for(int i=0;i<ar.length;i++)	
		{
			ar[i] = sc.nextInt();
		}


		System.out.println("Reverse order of user Entered Arrays is : ");
		for(int i=ar.length-1;i>=0;i--)	
		{
			System.out.print(ar[i]+" ");
		}


	}
}