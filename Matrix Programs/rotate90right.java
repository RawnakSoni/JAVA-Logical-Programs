class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("90 degree Right Rotation of Matrix is:");

		int[][] t = transposeany(a);

		int[][] r = rowrev(t);
		
		mt.dispMatrix(r);
	}

	static int[][] transposeany(int[][] mtx)
	{
		int[][] trp = new int[mtx[0].length][mtx.length];	
 
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				trp[j][i] = mtx[i][j];
			}
		}
		return trp;
	}

	static int[][] rowrev(int[][] mtx)
	{
		for(int i=0;i<mtx.length;i++)
		{
			int j=0,k=mtx[0].length-1;
			while(j<k)
			{
				int tmp=mtx[i][j];
				mtx[i][j]=mtx[i][k];
				mtx[i][k]=tmp;
				j++;
				k--;
			}

		}
		return mtx;
	}
}