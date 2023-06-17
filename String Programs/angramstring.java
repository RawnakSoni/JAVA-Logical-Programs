import java.util.Scanner;
import java.util.Arrays;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 Sentances : ");

		String s1 = sc.nextLine();	

		String s2 = sc.nextLine();	

		boolean rs = isAnagram2(s1,s2);

		if(rs==true)
			System.out.print("Strings are Anagram");
	
		else
			System.out.print("Strings ar'nt Anagram");

		sc.close();

	}

	static boolean isAnagram(String s1, String s2)
	{
		int[] f1 = countfreq(s1);
		int[] f2 = countfreq(s2);

		for(int i=0;i<26;i++)
		{	
			if(f1[i]!=f2[i])	
				return false;
		}
		return true;
	}

	static int[] countfreq(String s1)	
	{
		int[] count = new int[26];

		for (int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;

			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		return count;	
	}

	static boolean isAnagram2(String s1, String s2)
	{
		s1 = s1.replaceAll(" ","");

		s2 = s2.replaceAll(" ","");

		if(s1.length()!=s2.length())
			return false;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1,c2);
	}

	
}