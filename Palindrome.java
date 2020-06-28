package ProjectEuler;

public class Palindrome {
	public static boolean IsPalindrome(Integer str)
	{
		String s = str.toString();
		int i,j;
		//System.out.println("String is : " +s);
		//System.out.println("String len is : " +s.length());
		
		if (s.length()%2 ==0) // length is even 
		{
			for (i=0,j=s.length()-1; i <= (s.length()/2)-1 ;j--)
			{
				//System.out.println("I = " +i + "J = " + j);
				
				if (s.charAt(i)==s.charAt(j))
				{
					i++;
					continue;
				}
				else 
				{
					break;
				}
			}
			//System.out.println("after for I is : " +i);
			
			if (i == (s.length()/2)) 
			{
				//System.out.println("return true  ");
				
				return true;
			}
			else  
			{
				//System.out.println("return false  ");
				
				return false;
			}
		}
		else // length is odd
		{
			for (i=0,j=s.length()-1; i<j ;j--)
			{
				//System.out.println("I = " +i + "J = " + j);
				
				if (s.charAt(i)==s.charAt(j))
				{
					i++;
					continue;
				}
				else 
				{
					break;
				}
			}
			//System.out.println("After for I is : " +i + "  J = "+ j );
			
			if (i == j) 
			{
				return true;
			}
			else  
			{
				return false;
			}

		}
		//return false;
	}
	
	public static void main(String[] args) 
	{ 
	int i,j,Sum1 =0,Sum2=0;
	boolean Palindrome = false;
	int arr[] = new int[1000];
	int count=0;
	int largest = 0;
	for (i=999;i >500; i-- )
	{
		j = 999;
		while (j >500)
		{
			//System.out.println("I is : " +i + "  J = "+ j );
			//System.out.println("Sum1: " +Sum1 + " Sum2 : " +Sum2 );
			
			Sum1 = i*j;
			//Sum2 = i*(j-1);
			
		
			if (IsPalindrome(Sum1))
			{
				System.out.println("Palindrome found : " +Sum1);
				Palindrome = true;
				if (Sum1 > largest) largest = Sum1;
				//arr[count++]= Sum1;
				j--;
			}
			else 
			{
				j--;
			}
			
		}
	}
	/*for (int x =0 ;x< arr.length;x++)
	{
		System.out.println("Arr"+x+" : " +arr[x]);
	}*/
	
	//Palindrome = IsPalindrome(1001);
	//System.out.println("Palindrome output  : " +IsPalindrome(99022399));
	System.out.println("Largest  : " +largest);
	
	
	}
	
}
