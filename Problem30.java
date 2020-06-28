package ProjectEuler;

public class Problem30 {

	public static long Arr[] = new long[10];
	public static long getFifthPower(String Str)
	{
		long getFifthPower =0;
		//String[] S = Str.substring(beginIndex, endIndex);
		
		for (int x = 0 ; x<Str.length() ; x++)
		{
			getFifthPower += Arr[Integer.parseInt(Str.substring(x,x+1))];
		}
		
		return getFifthPower;
	}
	public static void main(String[] args) 
	{
		long SumofDigits=0,Total =0;
		for (int i = 1 ; i <10; i++)
		{
			Arr[i]= (long) Math.pow((int)i,5);
		}
		
		for(long x = 10 ; x<1000000; x++)
		{
			String Str = String.valueOf(x);
			SumofDigits=getFifthPower(Str);
			if (SumofDigits == x)
			{
				System.out.println(" X ="+x);
				Total +=x;
			}
		}
		System.out.println(" Total="+Total);
	}

}
