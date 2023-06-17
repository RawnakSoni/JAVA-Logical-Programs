import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();
		
		/*
		  ABCDE
		  ABCDE
		  ABCDE
		  ABCDE
		  ABCDE
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	
		System.out.println();
		
		/*
		  A
		  AB
		  ABC
		  ABCD
		  ABCDE
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		  a
		  bc
		  def
		  ghij
		  klmno
		*/
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print((char)(96+a)+" ");
				a++;
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		  EDCBA
		  DCBA
		  CBA
		  BA
		  A
		*/
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{	
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		  ABCDEF
		  GHIJKL
		  MNOPQR
		  STUVWX
		  YZABCD
		  EFGHIJ
		*/
		int d=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(64+d)+" ");
				d++;
				if(d==27)
					d=1;
				
			}
			System.out.println();
		}

		System.out.println();

		/*
	      A
	     BAB
	    CBABC	
	   DCBABCD
	  EDCBABCDE

		*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=i;k>=1;k--)
			{	
				System.out.print((char)(k+64));
			}

			for(int k=2;k<=i;k++)
			{	
				System.out.print((char)(k+64));
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
				System.out.print((char)(x+64));
				if(k<i)	
					x--;
				else
					x++;
			}
			System.out.println();
		}

		System.out.println();

		/*
	      A
	     ABA
	    ABCBA	
	   ABCDCBA
	  ABCDEDCBA

		*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<i;k++)
			{	
				System.out.print((char)(k+64));
			}

			for(int k=i;k>=1;k--)
			{	
				System.out.print((char)(k+64));
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
				System.out.print((char)(x+64));
				if(k<i)	
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}
}