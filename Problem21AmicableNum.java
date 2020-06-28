
public class Problem21AmicableNum {
	public static int ArrSum[] = new int[10000];
	
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
	
	public static void main(String[] args) {
		
		long Sum = 0;
	
		for (int i = 1; i<10000 ;i++ )
		{
			ArrSum[i]= getFactorSum(i);
		}
		
		//Check for amicable numbers 
		
		 for(int y = 1; y < 10000; y++ )
		{
			if(ArrSum[y]<10000 && ArrSum[ArrSum[y]]==y )
			{
				if (ArrSum[y]!= y)
				{
					Sum+=y;
				//System.out.println("Amicable number = " + y );
				//System.out.println("ArrSum[y] = " + ArrSum[y] );
				//System.out.println("ArrSum[ArrSum[y]] = " + ArrSum[ArrSum[y]] );
				}
			}
		}
		 
		 System.out.println("Amicable number Done; Sum =  " + Sum);
	}
}
