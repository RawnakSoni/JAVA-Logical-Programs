class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();

		System.out.println("User entered Matrix is : ");
		mt.dispMatrix(a);

		System.out.println("Row wise Reverse of Matrix : ");
		int[][] r = rowrev(a);
		mt.dispMatrix(r);	
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