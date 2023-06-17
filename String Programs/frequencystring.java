import java.lang.String;
import java.util.Scanner;

class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int uc=0,lc=0,dg=0,sp=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);

			if(ch>='a'&&ch<='z')
				lc++;

			else if(ch>='A'&&ch<='Z')
				uc++;

			else if(ch>='0'&&ch<='9')
				dg++;
		
			else
				sp++;
		}

		System.out.println("Number of Capital Letters : "+uc);
		System.out.println("Number of Small Letters : "+lc);
		System.out.println("Number of Digits : "+dg);
		System.out.println("Number of Special Characters : "+sp);
	
	}
}