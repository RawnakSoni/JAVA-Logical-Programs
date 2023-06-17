class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();

		System.out.println("User entered Matrix is : ");
		mt.dispMatrix(a);

		
		int[] mbig = diagbig(a);

		System.out.println("Diagonal wise Primary Big Element from Matrix : "mbig[0]);	

		System.out.println("Diagonal wise Secondary Big Element from Matrix : "+mbig[1]);
	}

	static int[] diagbig(int[][] mtx)
	{
		int pbig=mtx[0][0],sbig=mtx[0][mtx.length-1];
		for(int i=1;i<mtx.length;i++)
		{
			if(mtx[i][i]>pbig)
				pbig=mtx[i][i];

			if(mtx[i][mtx.length-1-i]>sbig)
				sbig=mtx[i][mtx.length-1-i];
		}
		int[] big = {pbig,sbig};
		return big;		
	}
}