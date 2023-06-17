class matrix
{
	public static void main(String[] args)
	{
		twoDarray mt = new twoDarray();
		int[][] a = mt.readMatrix();
		mt.dispMatrix(a);
		
		System.out.println("Transpose of Matrix is : ");
		int[][] t = transposeany(a);
		mt.dispMatrix(t);
	}


	// only applicable for square matrix

	static void transpose(int[][] mtx)
	{
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				System.out.print(mtx[j][i]+" ");
			}
			System.out.println();
		}
	}

	//	for any order of matrix

	static int[][] transposeany(int[][] mtx)
	{
		int[][] trp = new int[mtx[0].length][mtx.length];	//	to create a new Matrix of new order
 
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				trp[j][i] = mtx[i][j];
			}
		}
		return trp;
	}
}