import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		String rw = reversesentence(s1);
		System.out.print("Reversed Sentence is : "+rw);
		
	}
	
	static String reversesentence(String s1)
	{
		char[] ch = s1.toCharArray();
		String rs = "";

		for(int i=ch.length-1;i>=0;i--)
		{
			int k = i;

			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}

			int j = i+1;

			while(j<=k)
			{
				rs = rs + ch[j];
				j++;
			}
			if(i>=0)
				rs = rs + ch[i];
		}
		return rs;
	}
}