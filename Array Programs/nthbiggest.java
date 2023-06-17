import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		arrays ao = new arrays();
		int[] ar = ao.readArray();

		System.out.print("Elements of an array is : ");
		ao.dispArray(ar);

		System.out.print("Enter Nth Biggest Element : ");
		Scanner sc = new Scanner(System.in);
		int nth = sc.nextInt();

		int bg = nthbig(ar,nth);
		System.out.print(nth+"th Biggest Element is : "+bg);

	}

	static int nthbig(int[] ar,int nth)
	{
		
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==nth-1)
				return ar[i];
		}
		System.out.println(nth+"th Biggest is'nt Present");
		return 0;
	}
	
}
		
