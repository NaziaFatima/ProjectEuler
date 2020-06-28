import java.util.ArrayList;

//Non-abundant sums

public class Problem23 {
	public static int Limit = 28123;
	public static int ListofNum[] = new int[Limit];
	public static ArrayList<Integer> AbundantNum = new ArrayList<Integer>();
	
	public static int AbundantNumIndex[] = new int[100];
	
	public static int getFactorSum(int x)
	{
		int Count = 0,Sum =0;
		for(int i=1; i <= x/2 ; i ++)
		{
			if (x%i==0)
			{
				Count++;
				Sum+=i;
			}
		}
		return Sum;
	}
	
	public static void ListSumofAbundants()
	{	
		for (int i = 0; i < AbundantNum.size(); i++)
		{
			for(int j = 0; j < AbundantNum.size(); j++)
			{
				long s = AbundantNum.get(i)+ AbundantNum.get(j);
				if ( s < Limit)
				{
					ListofNum[(int)s]= 1;				
				}
			}
		}
	}
	public static void main(String[] args)
	{
		long Total = 0;
		for (int i = 1; i <= Limit ;i++ )
		{
			int Sum = 0;
			Sum = getFactorSum(i);
			if (Sum > i )
			{
				AbundantNum.add(i);
			}
			Sum = 0;
		}
		//Calculate list of abundant numbers
		ListSumofAbundants();
		//Calculate sum of remaining
		for (int i = 0;i < Limit; i++)
		{
			if (ListofNum[i] <= 0 )
			{
				Total += i;
			}
		}
		
		System.out.println(" Total = " +Total);
		
		System.out.println("Done");
		
		
	}

}
