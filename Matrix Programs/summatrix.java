class matrix
{
	public static void main(String args[])
	{
		
		twoDarray mt = new twoDarray();
	
		int[][] a = mt.readMatrix();

		mt.dispMatrix(a);

		int sm = summtx(a);
		System.out.print("Sum of Matrix Elements : "+sm);

	}

	static int summtx(int[][] mtx)
	{
		int sum=0;
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				sum+=mtx[i][j];
			}
		}
		return sum;
	}
}