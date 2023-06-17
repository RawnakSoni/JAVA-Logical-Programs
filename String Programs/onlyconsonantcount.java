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

			if(Character.isAlphabetic(ch))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					System.out.print("");
				else
					cc++;
			}
		}

		System.out.println("Number of Consonants : "+cc);
	
	}
}
		