import java.util.Hashtable;

public class Problem26 {
	
	public static int getCount(int x,int y)
	{	
		Hashtable<Integer,Integer> Decimal = new Hashtable<Integer, Integer>();
		int Div,Divisor,Quotient=0,Reminder=0,QuotientCounter=1;
		Div = x;
		Divisor = y;
			
		Quotient = Div/Divisor;
		Reminder = Div%Divisor;
		int Counter =0;
		while (Decimal.get(Reminder)==null && Reminder!=0)
		{
			Decimal.put(Reminder,1);
			Div = Reminder*10;
			Reminder = Div%Divisor;
			Counter++;
		}
		//System.out.println(" elements : " + Decimal.keySet());
		return Counter;
	}
	public static void main(String[] args)
	{
		int Max = 0, Num= 0 ;
		for (int i = 1; i < 1000; i++)
		{
			int Output = getCount(10,i);
			System.out.println(" Recurring Count of "+ i + " : " + Output);
			if (Output > Max) 
				{
				Max = Output;
				Num = i;
				}
		}
		
		System.out.println(" Max Recurring Count : " + Max);
		System.out.println(" Num for Max recurring count : " + Num);
		System.out.println(" Done ! ");

	}
}

