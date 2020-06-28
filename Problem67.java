package ProjectEuler;

import java.io.File;
import java.util.Scanner;

public class Problem67{
	public static String[] fields;
	public static int Arr[][]=new int[100][100];
	
	public static int[] toIntArray (String[] str,int x)
	{
		int list[] = new int[100];
		int i =0;
		for (String text : str) 
		{
			list[i++] = Integer.parseInt(text);
		}
		
		
		return list;
	}
	public static int max(int V1, int V2)
 	{
 		if (V1>V2) return V1;
 		else return V2; 
 	}
 	public static int[] getmax(int x,int y)
 	{
 		int returnArr[] = new int[100];
 		int Counter =0;
 		
 		 for (int i = 0 ; i < 100; i++)
 		 {
 			if (Arr[x][i]> 0)
 			{
 				int Value = max((Arr[x][i] + Arr[y][i]),(Arr[x][i] + Arr[y][i+1]));
 				returnArr[Counter] = Value;
 				Counter++;
 			}
 		 }
 		return returnArr;
 	}
	
	public static void main(String[] args) {
		try
		{
		
			Scanner in = new Scanner(new File("D:\\SC-Workspace\\Test\\src\\ProjectEuler\\p067_triangle.txt"));
			int i =0;
			while (in.hasNext()) 
			{ 
				String line = in.nextLine();
				fields=line.split(",");
				
				Arr[i++] =toIntArray(fields,i);
			    
			}
			in.close(); // don't forget to close resource leaks
			
			//Print 2d Array 
			
			/*
			 * for (int x[] : Arr) 
			{
				for (int y :x)
				{
					System.out.print(" "+y+" ");
				}
				System.out.println(" ");
			}
			*/
			//Solve problem : 
			int len = 99;
			//int OutputArr[][] = new int[100][100];
			for(int ind = len ; ind >0;ind--)
			{
				Arr[ind-1]=  getmax(ind-1,ind);
			}
			System.out.println(" OutputArr= "+Arr[0][0]);
			
			
			//End of solution 
		}
		catch (Exception e)
		{
			System.out.println("Exception : " + e );
		}	
	}

}
