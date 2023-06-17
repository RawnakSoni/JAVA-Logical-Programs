import java.util.Scanner;
class Test
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers to check within:");
		int n1=s.nextInt();
		int n2=s.nextInt();

		System.out.print("Happy Numbers within "+n1+" and "+n2+" are : ");
		for(int i=n1;i<=n2;i++)
		{	
			boolean rs=isHappy(i);
			if(rs==true)
				System.out.print(i+" ");
		}
	}
	static boolean isHappy(int x)
	{	
		while(x>9)
		{
			int sum=0;
			do{
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}
			while(x!=0);
			x=sum;
		}
		return x==1||x==7;
	}
}