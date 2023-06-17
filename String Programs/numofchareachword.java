import java.util.Scanner;
class string
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		char[] ch = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			String word = "";

			while(i<ch.length&&ch[i]!=' ')
			{
				word = word + ch[i];
				i++;
			}

			if(word.length()>0)
				System.out.println(word+" --> "+word.length()+" words");
		}
	
	sc.close();

	}

}
