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
			
		printperfect(n1,n2);

		int c = countPerfect(n1,n2);
		System.out.println("Count of Perfect Number within Range is : "+c);

		int s = sumofPerfect(n1,n2);
		System.out.println("Sum of Perfect Number within Range is : "+s);
		
	}

	static boolean isperfect(int n)	
	{
		int sum = 1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				sum = sum+i;
		}
		if(sum==n)
			return true;

		return false;
	}

	
	static void printperfect(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isperfect(i);
			if(rs==true)
				System.out.println(i+" is a Perfect Number");
		}
	}


	static int countPerfect(int n1, int n2)
	{
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isperfect(i);
			if(rs==true)
				count++;
		}
		return count;
	}

	static int sumofPerfect(int n1, int n2)
	{
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isperfect(i);
			if(rs==true)
				sum+=i;
		}
		return sum;
	}
	
}