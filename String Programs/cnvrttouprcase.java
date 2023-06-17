import java.lang.String;
import java.util.Scanner;

class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<'z')
				ch[i]=(char)(ch[i]-32);
		}
		s1=new String(ch);
		
		System.out.println(s1);
	}
}