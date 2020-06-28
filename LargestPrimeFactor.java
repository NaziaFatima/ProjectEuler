package ProjectEuler;

public class LargestPrimeFactor {
	
	public static long biggestPrimeFactor(long num) {
	    for (int div = 2; div < num; div++) {
	        
	    	if (num % div == 0) {
	            
	        	 System.out.println("num : "+ num + "  div : "+ div);
	        	 //System.out.println();
	        	num = num/div;
	            div--;
	        }
	    }
	    
	    return num;
	}
	public static void main(String[] args) { 
		long n = 10;
	long x = biggestPrimeFactor(1);
	
	System.out.println("Final : "+ x);
	
	}
}
