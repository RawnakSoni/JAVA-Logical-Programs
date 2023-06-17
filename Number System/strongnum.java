import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int n2 = sc.nextInt();
		
		printStrong(n1,n2);

		int cs = countStrong(n1,n2);
		System.out.println("Count of Strong Numbers within Range is- "+cs);

		int ss = sumStrong(n1,n2);
		System.out.println("Sum of Strong Numbers within Range is- "+ss);
			
	}

	static int factorial(int x)
	{
		int fact=1;
		while(x>0)
		{
			fact = fact*x;
			x--;
		}
		return fact;
	}

	static boolean isStrong(int n)
	{
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int r = n%10;
			sum = sum + factorial(r);
			n/=10;
		}
		if(sum==temp)
			return true;
		return false;
	}

	static void printStrong(int n1, int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isStrong(i);
			if(rs==true)
				System.out.println(i+" is a Strong Number");
		}
	}

	static int countStrong(int n1, int n2)
	{
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isStrong(i);
			if(rs==true)
				count++;
		}
		return count;
	}

	static int sumStrong(int n1, int n2)
	{
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			boolean rs = isStrong(i);
			if(rs==true)
				sum+=i;
		}
		return sum;
	}
}