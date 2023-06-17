import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year to Check : ");
		int n = sc.nextInt();
	
		boolean rs = isLeapYear(n);

		if(rs==true)
			System.out.print(n+" is a Leap Year");

		else
			System.out.print(n+" is'nt a Leap Year");
	}

	static boolean isLeapYear(int n)
	{
		if(n%4==0)
			return true;
		return false;
	}
}