import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();
		
		String ns = sencase(s1);
		System.out.print("Each word 1st char capital is : "+ns);	

		System.out.println();	
	
		String ns2 = lastcap(s1);
		System.out.print("Each word last char capital is : "+ns2);
		
	}

	static String sencase(String s1)
	{
		
		char[] ch = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		s1 = new String(ch);
		return s1;
	} 


	static String lastcap(String s1)
	{
		
		char[] ch = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		s1 = new String(ch);
		return s1;
	}


	
}