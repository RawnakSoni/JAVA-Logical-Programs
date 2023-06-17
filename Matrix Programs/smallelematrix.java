class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();
	
		mt.dispMatrix(a);

		int sm = smallele(a);
		System.out.print("Smallest element from Matrix : "+sm);
	}
	
	static int smallele(int[][] mtx)
	{
		int small = mtx[0][0];
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				if(mtx[i][j]<small)
					small = mtx[i][j];
			}
		}
		return small; 
	}

}