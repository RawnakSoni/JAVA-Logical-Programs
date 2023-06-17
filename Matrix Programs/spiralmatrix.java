class matrix
{
	public static void main(String[] args)
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		
		System.out.println("Spiral Matrix of User Entered elements is :");
		spiral(a);		
	}

	static void spiral(int[][] x)
	{	
		int n=x.length;
		int k;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(k=i;k<j;k++)
			{
				System.out.print(x[i][k]+" ");
			}
			for(k=i;k<j;k++)
			{
				System.out.print(x[k][j]+" ");
			}
			for(k=j;k>i;k--)
			{
				System.out.print(x[j][k]+" ");
			}
			for(k=j;k>i;k--)
			{
				System.out.println(x[k][i]+" ");
			}
		}
		if(n%2==1)
			System.out.println(x[n/2][n/2]);
	}
}