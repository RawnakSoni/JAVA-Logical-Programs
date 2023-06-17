import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();
		int st=1,sp=n/2;

/*

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print(" ");
			}

			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}

			if(i<=n/2)
			{	
				sp--;
				st=st+2;
			}

			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		
		System.out.println();
		
	
/*
          0
        0|0|0
      0|0|0|0|0
    0|0|0|0|0|0|0
  0|0|0|0|0|0|0|0|0
    0|0|0|0|0|0|0
      0|0|0|0|0
        0|0|0
          0

*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print("  ");
			}
			int x=1;
			for(int k=1;k<=st;k++)
			{
				if(k<st)
					System.out.print("0|");
				else 
					System.out.print("0");
				if(k<=st/2)
					x++;
				else
					x--;
			}

			if(i<=n/2)
			{	
				sp--;
				st=st+2;
			}

			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}

		System.out.println();

/*

     *
    * *
   *   *
  *     *
   *   *
    * *
     *

*/
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print(" ");
			}
			int x=1;
			for(int k=1;k<=st;k++)
			{
				if(k==1||k==st)
					System.out.print("*");
				else 
					System.out.print(" ");
			}

			if(i<=n/2)
			{	
				sp--;
				st=st+2;
			}

			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}


		System.out.println();

/*

              1
            1 2 1
          1 2 3 2 1
        1 2 3 4 3 2 1
	  2 4 6 8 
        1 2 3 4 3 2 1
          1 2 3 2 1
            1 2 1
              1
*/
		int m = n/2+1;	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print("  ");
			}
		
			if(i==m)
			{
				int y=2;
				for(int k=1;k<=st;k++)
				{
					if(k<=st/2)
						y=y+2;
					else
						y=y-2;
				}
			}
			
			else if(i!=m)
			{
				int y=1;
				for(int k=1;k<=st;k++)
				{
					System.out.print(y+" ");
					if(k<=st/2)
						y++;
					else
						y--;
				}
			}	

			if(i<=n/2)
			{	
				sp--;
				st=st+2;
			}

			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}

		System.out.println();

/*


*/

		System.out.print("Hello");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			for(int k=1;k<=st;k++)
			{
				System.out.print(x+" ");
				if(k<=st/2)
					x++;
				else
					x--;
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}

			System.out.println();
		}


		System.out.println();

/*


*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(k+" ");
				if(k<st)
				System.out.print("* ");
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}

			System.out.println();
		}
	}
		
}