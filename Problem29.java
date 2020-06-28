package ProjectEuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Problem29 {
	
	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("2");
		Set<String> Set = new HashSet<String>();
	    while ( number.compareTo(BigInteger.valueOf(101))==-1)
		{
			for (int j = 2 ; j <=100; j ++)
			{
				Set.add(number.pow(j).toString());
			}
			number=number.add(BigInteger.valueOf(1));
		}
		System.out.println(" Distinct numbers ="+Set.size());
	}

}
