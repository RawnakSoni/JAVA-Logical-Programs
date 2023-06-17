import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		arrays ao = new arrays();
		int[] ar = ao.readArray();

		System.out.print("User Entered Array is : ");
		ao.dispArray(ar);	

		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter Index number to delete element : ");
		int ind = sc.nextInt();

		int[] arnw = deletion(ar,ind);
		System.out.print("Now your array is : ");
		ao.dispArray(arnw);
	}

	static int[] deletion(int[] ar, int ind)
	{
		if(ind<0||ind>ar.length)
		{
			System.out.print("Index not in Range : ");
			return ar;			
		}

		int[] y = new int[ar.length-1];

		for(int i=0;i<y.length;i++)
		{
			if(i<ind)
				y[i] = ar[i];
			else
				y[i] = ar[i+1];
		}
		return y;
	}

}