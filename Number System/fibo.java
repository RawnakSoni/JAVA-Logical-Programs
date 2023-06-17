import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of N:");
		int n=sc.nextInt();
		
		System.out.print("Fibonacci Numbers within "+n+" : ");
		fibowithinN(n);
		System.out.println();

		System.out.print("First "+n+" Fibonacci Numbers are : ");
		firstnfibo(n);
		System.out.println();

		int fb1 = nthfibo(n);
		System.out.print(n+"th Fibonacci Number is : "+fb1);
		System.out.println();

		int fb2 = countfibowithinN(n);
		System.out.print("Count of Fibonacci Numbers within "+n+" are : "+fb2);
		System.out.println();

	}

	//print fibo within n
	static void fibowithinN(int n)
	{
		int f1=0,f2=1,f3;
		while(f1<=n)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}


	//first n fibo
	static void firstnfibo(int n)
	{
		int f1=0,f2=1,f3;
		while(n>0)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}


	//Nth fibo
	static int nthfibo(int n)
	{
		int f1=0,f2=1,f3;
		while(n>1)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f1;
	}


	//how many fibo within n
	static int countfibowithinN(int n)
	{
		int f1=0,f2=1,f3;
		int count=0;
		while(f1<=n)
		{
			count++;
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return count;
	}
}