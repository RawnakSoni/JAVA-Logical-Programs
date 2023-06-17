import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();
		
		/*
		  12345
		  12345
		  12345
		  12345
		  12345
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  11111
		  22222
		  33333
		  44444
		  55555
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		  10101
		  10101
		  10101
		  10101
		  10101
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  11111
		  00000
		  11111
		  00000
		  11111
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		  54321
		  54321
		  54321
		  54321
		  54321
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  1
		  21
		  321
		  4321
		  54321
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  54321
		  4321
		  321
		  21
		  1
		*/
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  1
		  00
		  111
		  0000
		  11111
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  1
		  10
		  101
		  1010
		  10101
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  12345
		  2345
		  345
		  45
		  5
		*/
		int a=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=a;j<=n;j++)
			{
				System.out.print(j+" ");
				
			}
			a++;
			System.out.println();
		}

		System.out.println();

		/*
		  10101
		  01010
		  10101
		  01010
		  10101

		*/
		int b=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(b%2+" ");
				b++;
			}
			System.out.println();
		}

		System.out.println();

		/*
		  1
		  01
		  101 		
		  0101
		  10101
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((i+j)%2+" ");			
			}
			System.out.println();
		}

		System.out.println();

		/*
		  12345
		  67891
		  23456
		  78912
		  34567
		*/
		int d=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(d+" ");
				d++;
				if(d==10)
					d=1;
				
			}
			System.out.println();
		}

		System.out.println();

		/*
		  11111
		  2222
		  333
		  44
		  5
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  5
		  44
		  333
		  2222
 		  11111
		*/
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println();

		/*
		  11111
		  0000
		  111
		  00
		  1
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		  1
		  2 6
		  3 7 10
		  4 8 11 13
		  5 9 12 14 15
		*/
		int e;
		for(int i=1;i<=n;i++)	
		{
			e=i;
			for(int j=1;j<=i;j++)
			{		
				System.out.print(e+" ");
				e+=n-j;
			}
		System.out.println();
		}
	}
}





