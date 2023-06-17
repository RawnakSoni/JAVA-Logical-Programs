import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of N:");
		int n=s.nextInt();

		System.out.print("Prime Numbers within "+n+" are : ");
		printPrime(n);
		System.out.println();
		
		System.out.print("Count of Prime Numbers within "+n+" is : ");
		int p1=countPrime(n);
		System.out.print(p1);
		System.out.println();

		System.out.print("Sum of Prime Numbers within "+n+" is : ");
		int p2=sumofPrime(n);
		System.out.print(p2);
		System.out.println();
	}		


	//main logic to check wether it is prime or not
	static boolean isPrime(int x)
	{
		for(int i=2;i*i<=x;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	//this will actually print prime numbers
	static void printPrime(int n)
	{	
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				System.out.print(i+" ");
		}
	}


	//this will count prime number within n
	static int countPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				count++; 
		}
		return count;
	}


	//sum of prime number
	static int sumofPrime(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				sum+=i;
		}
		return sum;
	}
}

















