import java.util.Scanner;
class Test
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range till  to Print Factorials : ");
		int n = sc.nextInt();

		System.out.println("Factorials of NUMBERS -");
		printFactorial(n);
	}

	static int Factorial(int n)
	{
		int sum = 1;
		while(n!=0)
		{
			sum = sum*n;
			n--; 
		}
		return sum;
	} 
	
	static void printFactorial(int n)
	{
		for(int i=0;i<=n;i++)
		{
			int fc = Factorial(i);
			System.out.println(i+"! --> "+fc);	
		}
	}  
} 