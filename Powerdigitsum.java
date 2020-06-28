package ProjectEuler;
import java.math.BigInteger;

public class Powerdigitsum {
	
	public static void main (String args[])
	{
		BigInteger number = new BigInteger("2");
		long Sum = 0;
		number= number.pow(1000);
		String s = number.toString();
		System.out.println("s = "+ s );
		for(int i=0 ; i < s.length(); i ++)
		{
			Sum += Integer.valueOf(String.valueOf(s.charAt(i)));
		}
		System.out.println("Total Sum = "+ Sum );
	}
}
