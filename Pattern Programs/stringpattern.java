import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String : ");
		String n = s.nextLine();
		
		/*
		  C
		  Cr
		  Cre
		  Cred
		  Credi
		  Credit

		*/
		for(int i=0;i<n.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n.charAt(j));
			}
			System.out.println();
		}
	}
}