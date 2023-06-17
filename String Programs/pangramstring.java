import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();	

		boolean rs = isPangram2(s1);
		
		if(rs==true)
			System.out.print("String is Pangram");
	
		else
			System.out.print("String is'nt Pangram");

		sc.close();
	}

	//	TYPE 1
	
	static boolean isPangram(String s1)
	{
		if(s1.length()<26)
			return false;

		int[] count = new int[26];

		for (int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;

			else if(ch>='a'&&ch<='z')
				count[ch-97]++;	
		}
		for (int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}


	//	TYPE 2
	
	static boolean isPangram2(String s1)
	{
		if(s1.length()<26)
			return false;
		
		s1 = s1.toLowerCase();
	
		for(char ch='a';ch<='z';ch++)
		{
			if(s1.indexOf(ch)==-1)
				return false;
		}	
		return true;
	}
	
}