class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();

		System.out.println("User entered Matrix is : ");
		mt.dispMatrix(a);

		System.out.println("Column wise Reverse of Matrix : ");
		int[][] r = colmrev(a);
		mt.dispMatrix(r);
	}

	static int[][] colmrev(int[][] mtx)
	{
		for(int i=0;i<mtx[0].length;i++)
		{
			int j=0,k=mtx.length-1;
			while(j<k)
			{
				int tmp=mtx[j][i];
				mtx[j][i]=mtx[k][i];
				mtx[k][i]=tmp;
				j++;
				k--;
			}

		}
		return mtx;
	}
}