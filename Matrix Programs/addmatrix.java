class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		System.out.println("Enter Elements in Matrix 1 :");
		int[][] a = mt.readMatrix();
		
		System.out.println("Enter Elements in Matrix 2 :");
		int[][] b = mt.readMatrix();

		System.out.println("User entered Matrix 1 :");
		mt.dispMatrix(a);

		System.out.println("User entered Matrix 2 :");
		mt.dispMatrix(b);

		System.out.println("New Matrix :");

		int[][] add = addMatrix(a,b);
	
		if(add==null)
			System.out.println("Addition Failed");
		else
			System.out.println("Added Matrix is :");
			mt.dispMatrix(add); 		
	}

	static int[][] addMatrix(int[][] a, int[][] b)
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
			return null;

		int[][] c = new int[a.length][b[0].length];

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}