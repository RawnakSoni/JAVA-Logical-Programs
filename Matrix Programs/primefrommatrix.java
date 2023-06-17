class matrix
{
	public static void main(String[] args)
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();
		
		System.out.println("User Entered Matrix is :");
		mt.dispMatrix(a);

		System.out.println("Prime Numbers from Matrix is :");
		printPrime(a);

	}

	static boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	static void printPrime(int[][] mtx)
	{	
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				boolean rs=isPrime(mtx[i][j]);

				if(rs==true)
					System.out.print(mtx[i][j]+" ");
			}
		}
	}
}