package ProjectEuler;
/*
 * 0 -0
1 -1
2 -2
3 -8
4 -3
5 -6
6 -9
7 - 17
8 -4
9 -20
10 -7

13 -10
14 -18
 * http://www.dcode.fr/collatz-conjecture
 * 
 * 
 */
public class LongestCollatzSequence {
	
	public static long Arr[]= new long[1000000];
	
	public static long Tot = 0;

	public static long genSequenceCount(long x)
	{
		long Count=0;
		
		if (x==1)
		{
			return 2;
		}
		else
		{
			//System.out.println("Mod = "+x%2);
			
			if ( x<1000000 && Arr[(int)x] >0)
			{
				return Arr[(int)x] +Tot ;
			}
			else if (x%2==0)
			{
				//System.out.println(" in Mod true x = "+x);
				
				Tot++;
				return genSequenceCount(x/2);
				
			}
			else if (x%2!=0)
			{
				//System.out.println(" in Mod false x= "+x);
				
				Tot++;
				return genSequenceCount((x*3)+1);
			}
			
			//Count = genSequenceCount(x)+1;
		}

		
		return -99;
	}
	
	public static void main (String args[])
	{
		long Output=0,Max=0;
		int Index=0;
		Arr[0]=0;Arr[1]=1;Arr[2]=2;Arr[3]=8;Arr[4]=3;Arr[5]=6;Arr[6]=9;Arr[7]=17;Arr[8]=4;Arr[9]=20;Arr[10]=7;
		Arr[11]=15;Arr[12]=10;Arr[13]=10;Arr[14]=18;Arr[15]=18;Arr[16]=5;Arr[17]=13;Arr[18]=21;Arr[19]=21;
		
		for (int i = 10; i<1000000;i++)
		{
			Tot=0;
			//System.out.println("I = " + i);
			
			Output = genSequenceCount(i);
			Arr[i]=Output;
			if (Output > Max)
			{
				Max = Output;
				Index = i;
			}
		}
		System.out.println("Index = " + Index);
		
		System.out.println("MAX = " + Max);
		
	}
	
}
