class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Sum of each Column :");
		int[] cs = colmsum(a);
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("Column "+(i+1)+" sum is : "+cs[i]);
		}		
	
	}

	static int[] colmsum(int[][] mtx)
	{
		int[] sum = new int[mtx[0].length];

		for(int i=0;i<mtx[0].length;i++)
		{
			for(int j=0;j<mtx.length;j++)
			{
				sum[i]+=mtx[j][i];
			}
		}
		return sum;
	}

}