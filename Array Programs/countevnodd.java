class array
{
	public static void main(String args[])
	{
		arrays ao = new arrays();
		int[] ar = ao.readArray();
	
		int[] cnt = counteo(ar);

		System.out.print("Count of Even Number within user entered Array is : "+cnt[0]);
		System.out.println();
		System.out.print("Count of Odd Number within user entered Array is : "+cnt[1]);
	}

	static int[] counteo(int[] ar)
	{
		int ce=0,co=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				ce++;
			else
				co++;
		}
		int count[] = {ce,co};
		return count;
	}
}