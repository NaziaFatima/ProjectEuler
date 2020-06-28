/*
 *
 * 
 */
public class Problem27 {
	public static int Primes[] = new int[87400];
	
	public static boolean isPrime(long x)
	{
		boolean isPrime = true;
		long ModX = Math.abs(x);
		for (long i = 2; i <=Math.sqrt(ModX); i++)
		{
			if (ModX%i ==0)return false; 
		}
		return isPrime;
	}
	
	public static int genCountofPrimes(long a,long b)
	{
		int genCountofPrimes =0;
		long Quadexpr =b,n=0;
		//boolean isPrime = isPrime(Quadexpr);
		for ( n=0; Primes[(int) Math.abs(Quadexpr)]==1 ; n++)
		{
			Quadexpr = ((n*n)+ (a*n) +b) ;
			genCountofPrimes++;
		}
		return genCountofPrimes-1;
	}
	public static void main(String[] args) 
	{	
		long StartTime =0,EndTime =0;
		StartTime=System.currentTimeMillis();
		long n =0,Count=0,MaxCount=0,Product=1;
		long Quadexpr =0;
		
		for (long x =3 ; x <=87400;x++ )
		{
			if(isPrime(x) == true)
			{
				Primes[(int) x] = 1;
			}
		}
		
		for(int a = -999 ; a < 1000; a++)
		{
			for(int b = -1000 ;b <=1000; b++)
			{
				if (b%2==0)
				{
					b++;
				}
				else if ((Math.abs(a+b)%2!=0))
				{
					a++;b++;
				}
				Count = genCountofPrimes(a,b);
				if (Count>MaxCount) 
					{
					MaxCount=Count;
					Product = a*b;
					}
			}
		}
		System.out.println(" Max Count of Primes  = " + MaxCount );
		System.out.println(" Product of A*B  = " + Product );
		System.out.println("Time taken in milli seconds = " + (System.currentTimeMillis()-StartTime));
	}

}
