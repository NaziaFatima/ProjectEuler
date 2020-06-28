import java.util.HashSet;
import java.util.Set;

import Euler.*;
public class Problem32 {

	public static void main(String[] args) {
		long i=0,j=0,k=0,Count=0; 
		Set<Integer> Set = new HashSet<Integer>();
		String str = (String.valueOf(i)+String.valueOf(j)+String.valueOf(k));
		System.out.print("str.len =" +str.length());	
		for(i = 1 ; i <=10000; i++)
		{
			for(j = i ; j <=10000; j++)
			{
				//System.out.println("str.len =" +str.length());	
				k = i*j;
				str = (String.valueOf(i)+String.valueOf(j)+String.valueOf(k));
				if(str.length()==9 && EulerMath.isPandigital(str))
					{
					System.out.print("i= "+ i +" J=" + j + " K=" +k);	
					System.out.println(" This is pandigital =" +  i + j+ k);
					Set.add((int)k);
					}
			}
		}
		for(int x :Set)
		{
			Count+=x;
		}
		System.out.println("Done Count = " + Count);
	}

}
