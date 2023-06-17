import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();
			
		String ns2 = vowel2upr(s1);
		System.out.print("Now Your String is is : "+ns2);
		
	}

	static String vowel2upr(String s1)
	{
		
		char[] ch = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{	
				ch[i]=(char)(ch[i]-32);
			}
		}
		s1 = new String(ch);
		return s1;
	}
}