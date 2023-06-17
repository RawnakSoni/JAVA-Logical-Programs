import java.util.Scanner;
class Test
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Decimal Numnber : ");
		int n = s.nextInt();

		String b = dectobin(n);
		System.out.print("Binary Number of "+n+" is : "+b);
		System.out.println();


		String o = dectooct(n);
		System.out.print("Octal Number of "+n+" is : "+o);
		System.out.println();

		String h = dectohex(n);
		System.out.print("HexaDecimal Number of "+n+" is : "+h);	
		System.out.println();
		
	}

	static String dectobin(int n)
	{
		String st="";
		do{
			int r=n%2;
			st=r+st;
			n=n/2;
		}
		while(n!=0);
		return st;
	}	

	static String dectooct(int n)
	{
		String st="";
		do{
			int r=n%8;
			st=r+st;
			n=n/8;
		}
		while(n!=0);
		return st;
	}	

	static String dectohex(int n)
	{
		String st="";
		do{
			int r=n%16;
			if(r<10)
				st=r+st;
			else
				st=(char)(r+55)+st;
			n=n/16;
		}
		while(n!=0);
		return st;
	}	
	
	static String dectohex2(int n)
	{
		String st="";
		do{
			int r=n%16;
			if(r<10)
				st=r+st;
			else if(r==10)
				st='A'+st;
			else if(r==11)
				st='B'+st;
			else if(r==12)
				st='C'+st;
			else if(r==13)
				st='D'+st;
			else if(r==14)
				st='E'+st;
			else
				st='F'+st;
			n=n/16;
		}
		while(n!=0);
		return st;
	}	
	
}