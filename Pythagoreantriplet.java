package ProjectEuler;

/*
A Pythagoreantriplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * 
 */
public class Pythagoreantriplet {
	public static int Arr[]= new int[1000];
	public static void main (String args[])
	{	int i,j ;
		int a=1,b=1,c =1;
		for (i = 2; i <1000; i++)
		{
			/*Arr[i]= i*i;
			System.out.println("Arr["+i+"]" +Arr[i]);
			for (j = 2; j <100; j++)
			{
				long ab,ab2;
				
				ab = i*j; 
				ab2 = (100*i) +(100*j) + 50000;
				if (ab == ab2) System.out.println("ab = " + ab);
			}
			
			
			long sum = (3*i) + (4*i) + (5*i);
			System.out.println(" For I = " +i +"3n+4n+5n  = " +sum );
			if ( (3*i) + (4*i) + (5*i) == 1000) System.out.println("I = " +i );		
			
			*/
			
			for (j=3;j<1000;j++)
			{
				a = (i*i)-(j*j);
				b = 2*i*j;
				c = (i*i)+(j*j);
				
				if (a+b+c==1000) 
					{
					System.out.println("I = " +i );System.out.println("J = " +j );
					System.out.println(" A = " +a + " B= "+b+ " C= "+ c );
					}
			}
			
		}
		
		System.out.println("no output = ");
	}
	
}

