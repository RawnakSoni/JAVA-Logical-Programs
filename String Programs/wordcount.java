import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();
		
		int wc = wordCount(s1);
		System.out.print("Number of Words in your String : "+wc);	
		
	}

	static int wordCount(String s1)
	{
		int count=0;
		char[] ch = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;
			}
		}
		return count;
	} 
}