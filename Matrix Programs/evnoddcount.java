class matrix
{
	public static void main(String args[])
	{
		twoDarray mt = new twoDarray();

		int[][] a = mt.readMatrix();
	
		mt.dispMatrix(a);

		int[] eo = evnodd(a);
		System.out.println("Count of Even Numbers from Matrix : "+eo[0]);
		System.out.print("Count of Odd Numbers from Matrix : "+eo[1]);
	}
	
	static int[] evnodd(int[][] mtx)
	{
		int ec = 0;
		int oc = 0;
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				if(mtx[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int[] count = {ec,oc};
		return count; 
	}

}