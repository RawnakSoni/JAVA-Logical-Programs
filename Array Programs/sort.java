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

		System.out.print("Ascending sort of an array : ");
		ascend(ar);
		System.out.println();

		System.out.print("Descending sort of an array : ");
		dscend(ar);
		System.out.println();
	}
		
	static void ascend(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}

		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}



	static void dscend(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}

		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}