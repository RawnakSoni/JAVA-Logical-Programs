import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting  number : ");
		int n1 = sc.nextInt();

		System.out.print("Enter Ending number : ");
		int n2 = sc.nextInt();
			
		printPallindrome(n1,n2);

		int c = countPallindrome(n1,n2);
		System.out.println("Count of Perfect Number within Range is : "+c);
		
	}

	static boolean isPallindrome(int n)	
	{
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10+(n%10);
			n/=10;
		}
		if(rev==temp)
			return true;

		return false;
	}

	
	static void printPallindrome(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isPallindrome(i);
			if(rs==true)
				System.out.println(i+" is a Pallindrome Number");
		}
	}


	static int countPallindrome(int n1, int n2)
	{
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isPallindrome(i);
			if(rs==true)
				count++;
		}
		return count;
	}
}