import java.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		int i,j;
/*
X BOX

* * * * * * * * *
* *           * *
*   *       *   *
*     *   *     *
*       *       *
*     *   *     *
*   *       *   *
* *           * *
* * * * * * * * *

*/
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<=n;j++)
			{	
				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();
/*
PLUS BOX

* * * * * * * * *
*       *       *
*       *       *
*       *       *
* * * * * * * * *
*       *       *
*       *       *
*       *       *
* * * * * * * * *

*/

		for(i=1;i<=n;i++)	
		{
			for(j=1;j<=n;j++)
			{	
				if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();

/*
ASTRISK

*       *       *
  *     *     *
    *   *   *
      * * *
* * * * * * * * *
      * * *
    *   *   *
  *     *     *
*       *       *

*/	
			
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<=n;j++)
			{	
				if(i==j||i+j==n+1||i==n/2+1||j==n/2+1)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	

		System.out.println();

/*
MESSAGEBOX

* * * * * * * * *
* *           * *
*   *       *   *
*     *   *     *
*       *       *
*               *
*               *
*               *
* * * * * * * * *

*/
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<=n;j++)
			{	
				if(i==1||i==n||j==1||j==n||i==j&&i<=n/2+1||i+j==n+1&&i<=n/2+1)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();
/*
SWASTIK

*       * * * * *
*       *       
*       *       
*       *       
* * * * * * * * *
        *       *
        *       *
        *       *
* * * * *       *

*/

		int m=n/2+1;
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<=n;j++)
			{	
				if(i==m||j==m||(i==1&&j>=m)||j==n&&i>=m||(i==n&&j<=m)||j==1&&i<=m)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println();

/*
POINTING TO DOWN

*                       *
  *                   *
    *               *
      *           *
        *       *
          *   *
            *
*/

		int p=1,q=2*n-1;
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<2*n;j++)
			{	
				if(j==p||j==q)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			p++;
			q--;
			System.out.println();
		}


		System.out.println();

/*
POITING TO UPWARD

            *
          *   *
        *       *
      *           *
    *               *
  *                   *
*                       *

*/

		int e=n,f=n;
		for(i=1;i<=n;i++)	
		{
			for(j=1;j<n*2;j++)
			{	
				if(j==e||j==f)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			e--;
			f++;
			System.out.println();
		}
	}
}

