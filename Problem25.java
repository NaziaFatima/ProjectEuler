package ProjectEuler;
import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("10");
		number= number.pow(999);
		BigInteger Number1 = new BigInteger("1");
		BigInteger Number2 = new BigInteger("1");
		long Index = 1;   
		
		for(long i = 3; i > 0; i ++)
		{
			Number2= Number2.add(Number1);
			Number1= Number2.subtract(Number1);
			if (Number2.compareTo(number)==1)
			{
				System.out.println("Number2="+Number2 );
				System.out.println("Index= "+ i );
				break;
			}
		}
		System.out.println("Done!!" );
		
		
		
	}

}
