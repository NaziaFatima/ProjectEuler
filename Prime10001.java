package ProjectEuler;

public class Prime10001 {

	public static boolean isPrime(long num)
	{
		int i = 2;
		while(i<=Math.sqrt(num))//while(i<=num-1)
		{
			if (num%i >0) i++;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{ 
	//System.out.println("isPrime : "+isPrime(101));
	
	int arr[] = new int[10001];
	int i = 2,count=0;
	 while(count<10001)
	 {
		 if (isPrime(i)) arr[count++]=i;
		 i++;
	 }
	 i=0;
	 /*while (i<=20)
	 {
		 System.out.println("Arr("+i+")"+arr[i++]);
	 }*/
	 System.out.println("Arr :"+arr[10000]);
	 
	 
	 
	}
}
