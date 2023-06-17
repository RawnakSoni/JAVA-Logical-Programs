import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		
		arrays ao = new arrays();
		int[] ar = ao.readArray();

		System.out.print("Elements of an array is : ");
		ao.dispArray(ar);

		System.out.print("Enter Elements to Search : ");
		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();

		int ln = lin$search(ar,ele);
		if(ln==-1)
			System.out.print("Elements is'nt present");
		else
			System.out.print("Elements is present @ index : "+ln);		
	}	
	
	static int lin$search(int[] ar,int ele)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				return i;	
		}
		return -1;
	}


}