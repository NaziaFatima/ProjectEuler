import Euler.EulerMath;

/*
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
 *  For example, 2143 is a 4-digit pandigital and is also prime.
What is the largest n-digit pandigital prime that exists?
 * 
 * 
 */
public class Problem41 {
	
	public static void main(String[] args) 
	{
		for(long x=7654321 ; x>=1234567 ; x--)
		{
			if (EulerMath.isPandigital(String.valueOf(x)) && EulerMath.isPrime(x))
			{
				System.out.println("Largest Pandigit Prime is  = " + x);
				break;
			}
		}
		System.out.println("Done");
	}

}
