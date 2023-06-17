import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();
		int sp=0,st=n;
/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print("  ");
			}

			for(int k=1;k<=st;k++)
			{
				System.out.print("* ");
			}

			if(i<=n/2)
			{	
				sp++;
				st=st-2;
			}

			else
			{
				sp--;
				st=st+2;
			}
			System.out.println();
		}

*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{	
				System.out.print("  ");
			}
			
			int x=sp+1;
		
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
				sp++;
				st=st-2;
			}

			else
			{
				sp--;
				st=st+2;
			}
			System.out.println();
		}
	}
}
		