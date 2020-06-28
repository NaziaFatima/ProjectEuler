package ProjectEuler;

public class SumOfPrimes {
	public static boolean isPrime(long num)
	{
		int i = 2,sqrt = 0;
		if (num%2==0 || num%3 ==0 || num%5==0) return false;
		sqrt = (int)Math.sqrt(num);
		if (sqrt*sqrt==num)return false;
		
		while(i<=sqrt)//while(i<=num-1)
		{
			if (num%i >0) i++;
			else return false;
		} 
		return true;
	}
	
	public static void main(String[] args) 
	{ long i = 3,Sum = 2+3+5; 
		for(i=6;i < 2000000;i++)
		{
			if (isPrime(i)) Sum = Sum+i;
		}
		System.out.println("Sum : "+Sum);
	}
}
