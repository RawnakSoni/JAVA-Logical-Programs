import java.util.Scanner;
class string
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String : ");
		String s1 = sc.nextLine();

		String nstr="";

		char ch[] = s1.toCharArray();

		for (int i=0 ;i<ch.length/2;i++ )
		{
			char temp = ch[i];

			ch[i] = ch[ch.length-1-i];

			ch[ch.length-1-i] = temp;
		}

		nstr = new String (ch);

		if(nstr.equalsIgnoreCase(s1))

			System.out.println("String is Pallindrome");
		else
			System.out.println("String is'nt a Pallindrome");
	}
}

//	CASE SENSITIVE

class string1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();
		
		boolean rs = isPallindrome(s1);
		
		if(rs==true)
			System.out.print("String is Pallindrome");
		else
			System.out.print("String is'nt a Pallindrome");

	}

	static boolean isPallindrome(String s1)
	{
		int i=0,j=s1.length()-1;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	} 
}




















