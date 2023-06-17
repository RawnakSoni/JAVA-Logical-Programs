class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Small element from each Column :");
		int[] cs = colmsmall(a);
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("Column "+(i+1)+" Smallest Element is : "+cs[i]);
		}		
	
	}

	static int[] colmsmall(int[][] mtx)
	{
		int[] small = new int[mtx[0].length];

		for(int i=0;i<mtx[0].length;i++)
		{
			small[i] = mtx[0][i];	
		
			for(int j=1;j<mtx.length;j++)
			{
				if(mtx[j][i]<small[i])
					small[i]=mtx[j][i];
			}
		}
		return small;
	}

}