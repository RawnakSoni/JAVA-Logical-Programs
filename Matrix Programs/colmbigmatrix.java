class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Big element from each Column :");
		int[] cb = colmbig(a);
		for(int i=0;i<cb.length;i++)
		{
			System.out.println("Column "+(i+1)+" Biggest Element is : "+cb[i]);
		}		
	
	}

	static int[] colmbig(int[][] mtx)
	{
		int[] big = new int[mtx[0].length];

		for(int i=0;i<mtx[0].length;i++)
		{
			big[i] = mtx[0][i];	
		
			for(int j=1;j<mtx.length;j++)
			{
				if(mtx[j][i]>big[i])
					big[i]=mtx[j][i];
			}
		}
		return big;
	}

}