import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();	
		
		int[] count = new int[128];
		
		for (int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			count[ch]++;
		}
		for (int i=0;i<128;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+" --> "+count[i]+" times");
		}

	}

}


//Case Irrespective ( Only Alphabet )

class string1
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :");
		String s1 = sc.nextLine();

		int[] count = new int[26];

		for (int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;

			else if(ch>='a'&&ch<='z')
				count[ch-97]++;	
		}
		for (int i=0;i<26;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65)+" --> "+count[i]+" times");
		}
	}
}




