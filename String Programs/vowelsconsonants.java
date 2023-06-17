import java.lang.String;
import java.util.Scanner;

class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int vc=0,cc=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
		}
		
		System.out.println("Number of Vowels : "+vc);
		System.out.println("Number of Consonants : "+cc);
		
	}
}


class string1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int vc=0,cc=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);

			if(Character.isAlphabetic(ch))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
		}
		
		System.out.println("Number of Vowels : "+vc);
		System.out.println("Number of Consonants : "+cc);
		
	}
}

/*
class string2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int vc=0,cc=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);

			if(Character.isAlphabetic(ch))
			{
				if(s1.indexOf(ch>=0))
					vc++;
				else
					cc++;
			}
		}
		
		System.out.println("Number of Vowels : "+vc);
		System.out.println("Number of Consonants : "+cc);
		
	}
}
*/			
		
























