class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();

		System.out.println("User entered Matrix is : ");
		mt.dispMatrix(a);

		
		int[] msum = diagsum(a);

		System.out.println("Diagonal wise Primary Sum of Matrix : "msum[0]);	

		System.out.println("Diagonal wise Secondary Sum of Matrix : "+msum[1]);
	}

	static int[] diagsum(int[][] mtx)
	{
		int pbig=mtx[0][0],sbig=mtx[0][mtx.length-1];
		for(int i=1;i<mtx.length;i++)
		{
			if(mtx[i][i]>pbig)
				pbig=mtx[i][i];

			if(mtx[i][mtx.length-1-i]>sbig)
				sbig=mtx[i][mtx.length-1-i];
		}
		int[] big = {psum,ssum};
		return sum;		
	}
}