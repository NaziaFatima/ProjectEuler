package Euler;
//package ProjectEuler;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class EulerMath {
	
	public static boolean isPrime(long n)
	{
		boolean isPrime = true;
		Long x = n;
		if (x<0)
		{
			 throw new ArithmeticException("Number Can not be less than Zero");  
		}
		else if (x>Long.MAX_VALUE)
		{
			throw new ArithmeticException("Number Can not be more than "+ Long.MAX_VALUE +" Use BigInteger variant of same method");  
		}
		for (long i = 2; i <=Math.sqrt(x); i++)
		{
			if (x%i ==0)return false; 
		}
		return isPrime;
	}
	
	public static boolean isPrime(BigInteger x)
	{
		//BigInteger num = new BigInteger(x.toString());
		boolean isPrime = true;
		/*
		 * Big Int compareTo Returns:-1, 0 or 1 as this BigInteger is numerically less than, equal to, or greater than val.
		 */
		if (x.compareTo(BigInteger.valueOf(0))==-1)
		{
			 throw new ArithmeticException("Number Can not be less than Zero");  
		}
		for (long i = 2; i <= Math.sqrt(x.longValue()); i++)
		{
			BigInteger result[] = new BigInteger[2]; 
			//divideAndRemainder = Returns an array of two BigIntegers containing (this / val) followed by (this % val). 
			result=x.divideAndRemainder(BigInteger.valueOf(i));
			if (result[1].equals(0))return false; 
		}
		return isPrime;
	}
	
	public static long NextPrime(long n)
	{
		long isPrime = 0;
		Long x = n,i;
		if (x<0)
		{
			 throw new ArithmeticException("Number Can not be less than Zero");  
		}
		else if (x>Long.MAX_VALUE)
		{
			throw new ArithmeticException("Number Can not be more than "+ Long.MAX_VALUE +" Use BigInteger variant of same method");  
		}
		for (i = x+1; i<= Long.MAX_VALUE; i++)
		{
			if (isPrime(i))return i; 
		}
		if (i >= Long.MAX_VALUE)
		{
			throw new ArithmeticException("Next prime is greated than "+ Long.MAX_VALUE +" Use BigInteger variant of same method");  
		}
		
		return isPrime;
	}
	
	public static BigInteger NextPrime(BigInteger x)
	{
		BigInteger num = new BigInteger(x.toString());
		//BigInteger isPrime ;
		/*
		 * Big Int compareTo Returns:-1, 0 or 1 as this BigInteger is numerically less than, equal to, or greater than val.
		 */
		if (x.compareTo(BigInteger.valueOf(0))==-1)
		{
			 throw new ArithmeticException("Number Can not be less than Zero");  
		}
		//for (long i = 2; i <= Math.sqrt(x.longValue()); i++)
		while(true)
		{
			num.add(BigInteger.valueOf(1));
			if (isPrime(num))
			{
				return num;
			}
		}
		//return isPrime;
	}
	
	public static boolean isPandigital(String str)
	{ 
		boolean isPandigital= false;
		
		Set<String> Set = new HashSet<String>();
		for (int j = 0 ; j <str.length(); j ++)
		{
			if (Set.contains(str.substring(j,j+1)))
			{
				//System.out.println("Returning false when j = "+ j);
				return false;
			}
			Set.add(str.substring(j,j+1));
		}
		//System.out.println("Set.size()="+Set.size());
		//System.out.println("str.length()="+str.length());
		//System.out.println("Set="+Set);
		
		if (Set.size()==str.length()) 
		{
			int i;
			for(i = 1;i <=Set.size();i++)
			{
				if(Set.contains(String.valueOf(i))) 
					continue;
				else
					{//System.out.println("Returning false when i = "+ i); 
					return false;
					}
			}
			if (i ==Set.size()+1) 
				return true;
			else
				return false;
		}
		else
		{
			//System.out.println("Returning false");
			return isPandigital;
		}
	}
	public static long getStringScore(String x)
	{
		long W=0;
		char[] str = x.toCharArray();
		for (int i =1; i < x.length()-1; i ++)
		{
			switch(str[i])
			{
			case 'A' : W += 1;	break;
			case 'B' : W += 2;	break;
			case 'C' : W += 3;	break;
			case 'D' : W += 4;	break;
			case 'E' : W += 5;	break;
			case 'F' : W += 6;	break;
			case 'G' : W += 7;	break;
			case 'H' : W += 8;	break;
			case 'I' : W += 9;	break;
			case 'J' : W += 10;	break;
			case 'K' : W += 11;	break;
			case 'L' : W += 12;	break;
			case 'M' : W += 13;	break;
			case 'N' : W += 14;	break;
			case 'O' : W += 15;	break;
			case 'P' : W += 16;	break;
			case 'Q' : W += 17;	break;
			case 'R' : W += 18;	break;
			case 'S' : W += 19;	break;
			case 'T' : W += 20;	break;
			case 'U' : W += 21;	break;
			case 'V' : W += 22;	break;
			case 'W' : W += 23;	break;
			case 'X' : W += 24;	break;
			case 'Y' : W += 25;	break;
			case 'Z' : W += 26;	break;
			}
		}
		return W;
	}
	
	public static BigInteger getFactorial(BigInteger x)
	{
		BigInteger num = new BigInteger("2");
		BigInteger Fact = new BigInteger("1");
		
		//BigInteger isPrime ;
		/*
		 * Big Int compareTo Returns:-1, 0 or 1 as this BigInteger is numerically less than, equal to, or greater than val.
		 */
		if (x.compareTo(BigInteger.valueOf(0))==-1)
		{
			 throw new ArithmeticException("Number Can not be less than Zero");  
		}
		while(num.compareTo(x)==-1 || num.compareTo(x)==0 )
		{
			num.add(BigInteger.valueOf(1));
			Fact = Fact.multiply(num);
		}
		return Fact;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("isPandigital="+ isPandigital("561347298"));
		
	}

}
