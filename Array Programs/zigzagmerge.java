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
		int[] ar3 = zigzag(ar1,ar2);
		System.out.print("Zig Zag Merged Array is : ");
		ao.dispArray(ar3);	
	}

	static int[] zigzag(int[]a,int[] b)
	{
		int[] c = new int[a.length+b.length];
		
		int i=0,k=0;
		while(i<a.length&&i<b.length)
		{
			c[k] = a[i];
			k++;
			c[k] = b[i];
			k++;
			i++;
		}
		while(i<a.length)
		{
			c[k] = a[i];
			k++;
			i++;
		}
		while(i<b.length)
		{
			c[k] = b[i];
			k++;
			i++;
		}
		return c;
	}
}
	 


		

		