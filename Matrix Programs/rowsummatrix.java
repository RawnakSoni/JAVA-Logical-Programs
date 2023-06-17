class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();
		
		int[][] a = mt.readMatrix();
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Sum of each Row :");
		int[] rs = rowsum(a);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println("Row "+(i+1)+" sum is : "+rs[i]);
		}		
	
	}

	static int[] rowsum(int[][] mtx)
	{
		int[] sum = new int[mtx.length];

		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				sum[i]+=mtx[i][j];
			}
		}
		return sum;
	}

}