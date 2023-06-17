class array
{
	public static void main(String args[])
	{
		arrays ao = new arrays();
		int[] ar = ao.readArray();

		System.out.print("User Entered Array is : ");
		ao.dispArray(ar);	

		System.out.println("Frequency of Each Character in your Array is : ");
		frequency(ar);
	
	}

	static void frequency(int[] ar)
	{
		boolean[] rs = new boolean[ar.length];		
		for(int i=0;i<ar.length;i++)
		{
			if(rs[i]==false);
			{
				int count = 1;
				for(int j=i+1;j<ar.length;j++)
				{	
					if(ar[i]==ar[j])
					{	
						count++;
						rs[j]=true;
					}
				}
				System.out.println(ar[i]+" --> "+count+" times");
			}
		}
	}

}