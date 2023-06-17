class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();

		System.out.println("User entered Matrix is : ");
		mt.dispMatrix(a);

		System.out.println("Diagonal wise Reverse of Matrix : ");
		int[][] r = diagrev(a);
		mt.dispMatrix(r);	
	}

	static void diagrev(int[][] mtx)
	{
		int i=0,j=mtx.length-1;
		while(i<j)
		{
				
			int tmp=mtx[i][i];
			mtx[i][i]=mtx[j][j];
			mtx[j][j]=tmp;
			
			temp=mtx[i][j];
			mtx[i][j]=mtx[j][i];
			mtx[j][i]=tmp;
			i++;
			j--;
		}
	}
}