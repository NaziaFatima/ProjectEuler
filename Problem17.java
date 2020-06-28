package ProjectEuler;
/*One,two,three,four,five,six,seven,eight,nine,ten= 3,3,6,4,4,3,5,5,4,3
 * Eleven=6 * twelve =6
 * thirteen = 8
 * fourteen=8
 * fifteen=7
 * sixteen=7
 * seventeen=9
 * eighteen=8
 * nineteen=8
 * twenty=6
 * thirty=6
 * forty=5
 * fifty=5
 * sixty=5
 * seventy=7
 * eighty=6
 * ninety=6
 *  hundred=7
 *  thousand=8
 *  and=3
 */
public class Problem17 {
	
	public static int getCount2(int x)
	{
		System.out.println(" get count i/p  = " + x);
		
		switch(x)
		{
		case 1: return 3;		case 2: return 3;		case 3: return 5;		case 4: return 4;
		case 5: return 4;		case 6: return 3;		case 7: return 5;		case 8: return 5;
		case 9: return 4;		case 10: return 3;		case 11: return 6;		case 12: return 6;
		case 13: return 8;		case 14: return 8;		case 15: return 7;		case 16: return 7;
		case 17: return 9;		case 18: return 8;		case 19: return 8;		case 20: return 6;
		case 30: return 6;		case 40: return 5;		case 50: return 5;		case 60: return 5;
		case 70: return 7;		case 80: return 6;		case 90: return 6;		case 100: return 7;
		case 1000: return 11;
		default : return 0;
		}		
		//return 0;
	}
	
	public static void main (String args[])
	{
		int num = 1000, Sum= 0,t;
		
		for(int i = 1 ; i <= num; i++)
		{
			String s = String.valueOf(i);
			int x,y,z;
			if (i <= 20 )
			{
				t = getCount2(i);
				Sum = Sum + t;
				System.out.print("i/p below 20 =" +i );	
				System.out.println("  o/p  below 20 = " + t);
				
				//System.out.println("  Sum  = " + Sum);
				
			}
			
			
			if (i > 20 && i < 100)
			{
				
				x = Integer.parseInt(s.substring(0,1));
				y = Integer.parseInt(s.substring(1,2));
				
				//System.out.print("x=" +x);System.out.print("y=" +y);
				System.out.print("i/p =" +i );		
				t = getCount2(x*10)+ getCount2(y);
				System.out.println("  o/p  = " + t);
				
				Sum =Sum + t;
				//System.out.println("  Sum  = " + Sum);
				
			}else if (i >=100 && i <1000)
			{
				x = Integer.parseInt(s.substring(0,1));
				y = Integer.parseInt(s.substring(1,2));
				z = Integer.parseInt(s.substring(2,3));
				
				System.out.print("x=" +x);System.out.print(" y=" +y);System.out.print(" z=" +z);
				System.out.print(" i/p =" +i );	
				if (i%100==0)
				{
					t= getCount2(x)+7;
				}
				else
				{
					if (Integer.parseInt(s.substring(1,3)) <=20)
					{t = getCount2(x)+ getCount2(Integer.parseInt(s.substring(1,3)))+10;}
					else
					{t = getCount2(x)+ getCount2(y*10)+getCount2(z) +10;}
					
				}
				System.out.println("  o/p  = " + t);	
				Sum = Sum+ t;
				//System.out.println("  Sum  = " + Sum);
			}else if (i ==1000)
			{
				Sum = Sum+11;
			}
		}
		
		System.out.println(" Final Sum  = " + Sum);
	}
	
}
