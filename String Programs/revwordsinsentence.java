import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String : ");
		String s1 = sc.nextLine();

		String rw = reversewords(s1);
		System.out.print("Reversed words String is : "+rw);
		
	}
	
	static String reversewords(String s1)
	{
		char[] ch = s1.toCharArray();
		String rs = "";

		for(int i=0;i<ch.length;i++)
		{
			int k = i;

			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}

			int j = i-1;

			while(j>=k)
			{
				rs = rs + ch[j];
				j--;
			}
			if(i<ch.length)
				rs = rs + ch[i];
		}
		return rs;
	}
}