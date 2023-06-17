import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter "+n+" values in an array : ");
		for(int i=0;i<ar.length;i++)	
		{
			ar[i] = sc.nextInt();
		}

		int bg = bigele(ar);
		System.out.println("Biggest element from an Array is : "+bg);

		int sm = smallele(ar);
		System.out.println("Smallest element from an Array is : "+sm);

		int sum = sumarr(ar);
		System.out.println("Sum of elements of an Array is : "+sum);

		
		
		System.out.print("Prime numbers from an Array is : ");
		primearray(ar);
		System.out.println();

		int []counteo = evnodd(ar);
		System.out.println("count of even values in user entered array is : "+counteo[0]);
		System.out.println("count of odd values in user entered array is : "+counteo[1]);

		System.out.print("Updated numbers of an Array is : ");
		update(ar);

	}


		static int bigele(int[] ar)
		{	
			int lg=ar[0];

			for(int i=0;i<ar.length;i++)	
			{
				if(ar[i]>lg)
					lg=ar[i];
			}			
			return lg;
		}

		static int smallele(int[] ar)
		{	
			int sr=ar[0];

			for(int i=0;i<ar.length;i++)	
			{
				if(ar[i]<sr)
					sr=ar[i];
			}			
			return sr;
		}

		static int sumarr(int[] ar)
		{
			int ttl=0;
			for(int i=0;i<ar.length;i++)	
			{
				ttl+=ar[i];
			}
			return ttl;	
		}

		static boolean isPrime(int x)
		{
			for(int i=2;i*i<=x;i++)
			{
				if(x%i==0)
					return false;
			}
			return true;
		}

		static void update(int[] ar)
		{
			for(int i=0;i<ar.length;i++)
			{
				int sum=0;
				while(ar[i]!=0)
				{	
					int r = ar[i]%10;
					sum += r;	
					ar[i]/=10;
				}
				ar[i]=sum;
				System.out.print(ar[i]+" ");
			}
		}

		static void primearray(int[] ar)
		{	
			for(int i=0;i<ar.length;i++)
			{
				boolean rs = isPrime(ar[i]);
				if(rs==true)
					System.out.print(ar[i]+" ");
			}
		}			

		static int[] evnodd(int[] ar)
		{	
			int ce=0,co=0;
			for(int i=0;i<ar.length;i++)	
			{
				if(ar[i]%2==0)
					ce++;
				else
					co++;
			}			
			int[] count= {ce,co};
			return count;
		}
	
		
}