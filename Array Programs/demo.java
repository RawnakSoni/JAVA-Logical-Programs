class array
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int n=s.nextInt();

		int []a = new int[n];

		System.out.println("Enter "+n+" Values");

		for(int i=0;i<a.length;i++)
		{	
			a[i]=s.nextInt();
		}

		System.out.println("Enter Size of Array:");
		int n=s.nextInt();

		int []b = new int[n];

		System.out.println("Enter "+n+" Values");

		for(int i=0;i<b.length;i++)
		{	
			b[i]=s.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
}