package ProjectEuler;

public class LatticePaths {

	public static void main (String args[])
	{
		int gridLength = 20;
		long Arr[][] = new long[gridLength+1][gridLength+1];
		
		for (int i =0 ; i <gridLength; i++ )
		{
			Arr[gridLength][i]=1;
			Arr[i][gridLength]=1;
		}
		for(int i = gridLength-1; i >=0 ; i--)
		{
			for(int j = gridLength-1; j >=0 ; j--)
			{
				Arr[i][j]=Arr[i+1][j]+Arr[i][j+1];	
			}	
		}
		System.out.println(" Arr[0][0]: "+ Arr[0][0]);
	}
	
}