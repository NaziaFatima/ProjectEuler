/*
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class Problem36 {
	public static boolean isPalindrome(String str)
	{
		boolean isPalindrome= false;
		int i , j ;
		if (str.length()==0) return false;
		if (str.length()==1) return true;
		
		int loop =str.length()/2;
			for(i = 0, j =str.length() ; i<=loop ; i ++,j--)
			{	
				if (str.substring(i,i+1).equalsIgnoreCase(str.substring(j-1,j)))
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			if (i-1==loop ) 
				isPalindrome= true;
			else 
				isPalindrome = false;
			
		return isPalindrome;
	}
	public static void main(String[] args) 
	{	long Count = 0;
		boolean decPal, BinPal;
		for(long x = 1; x<=1000000; x++)
		{
			decPal = isPalindrome(Integer.toString((int)x,10));
			BinPal = isPalindrome(Integer.toString((int)x,2));
			if (decPal && BinPal)
			{
				Count+=x;
			}
		}
		System.out.println(" Done Count = " + Count );
	}

}
