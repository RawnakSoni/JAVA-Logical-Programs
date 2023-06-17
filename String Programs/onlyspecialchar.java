import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int count=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);

			if(Character.isAlphabetic(ch))
				System.out.print("");

			else if(ch>='0'&&ch<='9')	
				System.out.print("");

			else
				count++;
			
		}
		System.out.println("Special Character Found : "+count);
	
	}
}
		