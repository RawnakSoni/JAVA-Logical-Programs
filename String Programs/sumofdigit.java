import java.lang.String;
import java.util.Scanner;

class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		int sm=0;
		
		char[] ch = s1.toCharArray();

		for(int i=0;i<s1.length();i++)
		{
			

			if(ch[i]>=48&&ch[i]<=57)
				sm=sm+ch[i]-48;
		}
		System.out.println("Sum of Digits in a String is   : "+sm);

	}
}