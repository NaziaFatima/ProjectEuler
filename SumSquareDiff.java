package ProjectEuler;

public class SumSquareDiff {

	public static void main(String[] args) { 
		
	//(N * (N + 1) * (2N + 1)) / 6
		
	long x,y,z,Diff;
	
	x = ((100*101)*((2*100)+1))/6;
	y = ( 100 * 101)/2;
	
	Diff= (y*y)-x;
	
	System.out.println("Diff= "+ Diff);
	
	}

}
