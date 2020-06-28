package ProjectEuler;

public class MultiplesOf3and5 {

	public static void main(String[] args) { 
		//int Num1,Num2,Count;
		int Sumof3,Sumof5,Sumof15,Sum;
		
		Sumof3 = 	3 * ((333*334)/2);
		Sumof5 = 	5 * ((200*199)/2);
		Sumof15 = 	15* ((66*67)/2);
		
		Sum = Sumof3 + Sumof5 - Sumof15;
		
		System.out.println("Sum = "+ Sum);
	}
}
