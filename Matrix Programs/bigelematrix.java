class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();
	
		mt.dispMatrix(a);

		int bg = bigele(a);
		System.out.print("Biggest element from Matrix : "+bg);
	}
	
	static int bigele(int[][] mtx)
	{
		int big = mtx[0][0];
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				if(mtx[i][j]>big)
					big = mtx[i][j];
			}
		}
		return big; 
	}

}