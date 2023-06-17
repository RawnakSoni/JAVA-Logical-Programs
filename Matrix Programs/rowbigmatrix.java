class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Big element from each Row :");
		int[] rb = rowbig(a);
		for(int i=0;i<rb.length;i++)
		{
			System.out.println("Row "+(i+1)+" Biggest Element is : "+rb[i]);
		}		
	
	}

	static int[] rowbig(int[][] mtx)
	{
		int[] big = new int[mtx.length];

		for(int i=0;i<mtx.length;i++)
		{
			big[i] = mtx[i][0];

			for(int j=1;j<mtx[i].length;j++)
			{
				if(mtx[i][j]>big[i])
					big[i]=mtx[i][j];
			}
		}
		return big;
	}

}