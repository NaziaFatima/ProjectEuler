package ProjectEuler;

public class EvenFibonacci {
	public static void main(String[] args) { 
		
		int P2,Count;
		Count = 2;P2 = 2;
		
		for (int i = 3;i <= 4000000;)
		{
			if (i%2 == 0)
			{
				Count = Count + i;
				//System.out.println("Sum "+ Count);
				
			}
			i = i + P2;
			P2= i - P2;
			
		}
		System.out.println("Final Sum "+ Count);
		
	}
}
