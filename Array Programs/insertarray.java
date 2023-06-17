import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		System.out.println("For Array1 -");
		arrays ao = new arrays();
		int[] ar = ao.readArray();

		System.out.println("For Array2 -");
		int[] br = ao.readArray();

		System.out.print("User Entered Array 1 is : ");
		ao.dispArray(ar);

		System.out.print("User Entered Array 2 is : ");
		ao.dispArray(br);

		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter Index number to insert Array : ");
		int ind = sc.nextInt();

		int[] arnw = insertarray(ar,br,ind);
		System.out.print("Now your array is : ");
		ao.dispArray(arnw);
	}

	static int[] insertarray(int[] ar, int[] br, int ind)
	{
		if(ind<0||ind>ar.length)
		{
			System.out.print("Index not in Range : ");
			return ar;			
		}

		int[] y = new int[ar.length+br.length];
		
		for(int i=0;i<br.length;i++)
		{
			y[ind+i] = br[i];
		}

		for(int i=0;i<ar.length;i++)
		{
			if(i<ind)
				y[i] = ar[i];
			else
				y[br.length+i] = ar[i];
		}
		return y;
	}

}