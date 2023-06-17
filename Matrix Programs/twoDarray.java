import java.util.Scanner;
class twoDarray
{
	int[][] readMatrix()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows :");
		int r = sc.nextInt();

		System.out.println("Enter Number of Columns :");
		int c = sc.nextInt();

		int[][] mtx = new int[r][c];

		System.out.println("Enter "+r*c+" Values : ");

		for(int i=0;i<mtx.length;i++)
		{	
			for(int j=0;j<mtx[i].length;j++)
			{	
				mtx[i][j] = sc.nextInt();
			}
		}
		return mtx;
	}


	void dispMatrix(int[][] mtx)
	{ 
		for(int i=0;i<mtx.length;i++)
		{
			for(int j=0;j<mtx[i].length;j++)
			{
				System.out.print(mtx[i][j]+" ");
			}
			System.out.println();
		}
	}
}