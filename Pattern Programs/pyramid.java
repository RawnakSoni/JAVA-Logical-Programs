import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();
		
/*

    *
   ***
  *****
 *******
*********

*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print("*");				
			}

			System.out.println();
		}

		System.out.println();

/*

*********
 *******
  *****
   ***
    *

*/

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print("*");				
			}
			
			System.out.println();
		}

		System.out.println();

/*
    1
   121
  12321
 1234321
123454321

*/
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
			{	
				System.out.print(k);
			}

			for(int k=i-1;k>=1;k--)
			{	
				System.out.print(k);
			}

			System.out.println();
		}

		System.out.println();

		
				//OR

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			int x=1;

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print(x);
				if(k<i)	
					x++;
				else
					x--;
			}

			System.out.println();
		}

		System.out.println();
		

/*
      1
     212
    32123
   4321234
  543212345

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=i;k>=1;k--)
			{	
				System.out.print(k);
			}

			for(int k=2;k<=i;k++)
			{	
				System.out.print(k);
			}

			System.out.println();
		}
		
		System.out.println();

				//OR

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			int x=i;

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print(x);
				if(k<i)	
					x--;
				else
					x++;
			}

			System.out.println();
		}

		System.out.println();


/*
    1
   101
  10101
 1010101
101010101

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print(k%2);				
			}

			System.out.println();
		}

		System.out.println();

/*
    1
   010
  10101
 0101010
101010101

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=0;k<2*i-1;k++)
			{	
				System.out.print((i+k)%2);				
			}

			System.out.println();
		}

		System.out.println();
/*

    0
   101
  01010
 1010101
010101010

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=2*i-1;k++)
			{	
				System.out.print((i+k)%2);				
			}

			System.out.println();
		}

		System.out.println();

	}
}










