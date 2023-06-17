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

		System.out.print("Enter Element to insert : ");
		int ele = sc.nextInt();

		System.out.print("Enter Index number : ");
		int ind = sc.nextInt();

		int[] arnw = insertion(ar,ele,ind);
		System.out.print("Now your array is : ");
		ao.dispArray(arnw);
	}

	static int[] insertion(int[] ar, int ele, int ind)
	{
		if(ind<0||ind>ar.length)
		{
			System.out.print("Index not in Range : ");
			return ar;			
		}

		int[] y = new int[ar.length+1];
		y[ind] = ele;

		for(int i=0;i<ar.length;i++)
		{
			if(i<ind)
				y[i] = ar[i];
			else
				y[i+1] = ar[i];
		}
		return y;
	}

}