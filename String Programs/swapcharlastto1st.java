import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		String ns = swapchar(s1);
		System.out.print("Your String after swapping characters is : "+ns);
	}

	static String swapchar(String s1)
	{
		char[] ch = s1.toCharArray();

		int f = 0;

		
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f = i;
			}
			
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp = ch[f];
				ch[f] = ch[i];
				ch[i] = temp;
			}
		}
		s1 = new String(ch);
		return s1;
	}
}