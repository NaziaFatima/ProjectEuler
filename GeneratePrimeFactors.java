package ProjectEuler;

public class GeneratePrimeFactors {
	//public static int Arr[]= new int[160000];
	//public static int Arr[]= {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
	
	public static int TriangleList[]= new int[600];
	
	public static int Count=0;
	public static void generateSequence()
	{
		int i=0,Sum=1;
		TriangleList[0]=1;
		for (i=1;i<600;i++)
		{	Sum = Sum+i+1;
			TriangleList[i]= Sum;
			//System.out.println("TriangleList{"+i+"}: "+TriangleList[i]);
		}
	}
	public static void getFactors(long n,long x)
	{
		if (x==1) 
		{	
			//System.out.println("Factor is : "+1+ " and " +n);
			Count = Count +2;
			getFactors(n,x+1);
		}
		
		
		if (x>1 && x<=(int)Math.sqrt(n))
		{   
			//System.out.println("X is : "+x);
			if (n%x==0) 
			{
				//System.out.println("Factor is : "+x+ " & " +n/x);
				Count = Count +2;
			}
			if(x<n)
			{
				getFactors(n,x+1);
			}
			else if(n==x) {return;}
		}
	}
	
	
	public static void main (String args[])
	{   
		long i = 0,Sum=1;
		Count = 0;
		
		//generateSequence();
		for (i= 8905;i<89100;i++)
		{	
			Count=0;
			//getFactors(i,1);
			Sum = (i *(i+1))/2;
			getFactors(Sum,1);
			
			//System.out.println("I = "+ i +" Sum=" +Sum+" Count=" +Count);
			if (Count >500) 
			{
				System.out.println("---->I = "+ Sum+" Count=" +Count);break;
			}
		}
		System.out.println("Done");
	}
}
