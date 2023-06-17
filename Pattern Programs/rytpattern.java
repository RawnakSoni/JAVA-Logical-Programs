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
   A B
  * * *
 A B C D
* * * * *		  

*/

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}	
				
			if(i%2==0)
			{
				for(int k=1;k<=i;k++)
				{
					System.out.print((char)(k+64)+" ");	
				}	
			}
			else
			{
				for(int k=i;k>=1;k--)
				{	
					System.out.print("* ");				
				}
			}
			System.out.println();
		}

		System.out.println();

		/*

		*****
		 ****
		  ***
		   **
		    *
		  
		*/

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
			{	System.out.print("*");				
	
			}

			System.out.println();
		}

	
	}
}