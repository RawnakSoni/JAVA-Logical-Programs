import java.util.Scanner;
class Test
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Enter Binary Number : ");
		int n = s.nextInt();

		int b = bintodec(n);
		System.out.print("Decimal Number of Binary NUmber("+n+") is : "+b);
		System.out.println();

		System.out.print("Enter Octal  Number : ");
		int n2 = s.nextInt();

		int o = octtodec(n2);
		System.out.print("Decimal Number of Octal Number("+n2+") is : "+o);
		System.out.println();

	}


	static int bintodec(int n)	
	{
		int dec=0,pw=1;
		do{
			int d=n%10;
			dec=dec+d*pw;
			pw=pw*2;
			n=n/10;
		}while(n!=0);
		return dec;
	}
	
	static int octtodec(int n)	
	{
		int dec=0,pw=1;
		do{
			int d=n%10;
			dec=dec+d*pw;
			pw=pw*8;
			n=n/10;
		}while(n!=0);
		return dec;
	}
}