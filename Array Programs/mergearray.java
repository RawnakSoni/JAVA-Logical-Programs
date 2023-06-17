class array
{
	public static void main(String args[])
	{
		arrays ao = new arrays();
		int[] ar1 = ao.readArray();
		int[] ar2 = ao.readArray();

		System.out.print("Elements of array 1 is : ");
		ao.dispArray(ar1);

		System.out.print("Elements of array 2 is : ");
		ao.dispArray(ar2);

		int[] ar3 = merge(ar1,ar2);
		System.out.print("Merged Array is : ");
		ao.dispArray(ar3);
		

	}

	static int[] merge(int[]a,int[] b)
	{
		int[] c = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];	
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length] = b[i];	
		}
		return c;
	}
}
	 


		

		