import Euler.EulerMath;
import java.math.*;
import java.math.BigInteger;

public class Problem34 {
	public static long Arr[]= new long[10];
	
	public static long FactSumofDigits(long x)
	{	
		long Fact = 0;
		String str = String.valueOf(x);
		int val=0;
		for (int i = 0; i < str.length() ; i ++)
		{
			val = Integer.parseInt(str.substring(i,i+1));
			Fact = Fact+Arr[val];
		}
		return Fact;
	}
	
	public static void main(String[] args) 
	{
		long x = 11,FactSumofDigits=0,Sum=0;
		BigInteger Fact  = new BigInteger("11");
		for (int i = 0; i < 10;i++)
		{
			Arr[i] = EulerMath.getFactorial(BigInteger.valueOf(i)).longValue();
		}
		for(x=11;x<999999; x++)
		{
			FactSumofDigits = FactSumofDigits(x);
			if(x==FactSumofDigits)
			{
				Sum+=x;
			}
		}
		System.out.println(" Curious num Sum = " + Sum );
	}
}
