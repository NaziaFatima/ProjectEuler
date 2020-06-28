package ProjectEuler;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {
	
	 public static String[] fields;
	
	public static long getWorth(String x)
	{
		long W=0;
		char[] str = x.toCharArray();
		for (int i =1; i < x.length()-1; i ++)
		{
			switch(str[i])
			{
			case 'A' : W += 1;	break;
			case 'B' : W += 2;	break;
			case 'C' : W += 3;	break;
			case 'D' : W += 4;	break;
			case 'E' : W += 5;	break;
			case 'F' : W += 6;	break;
			case 'G' : W += 7;	break;
			case 'H' : W += 8;	break;
			case 'I' : W += 9;	break;
			case 'J' : W += 10;	break;
			case 'K' : W += 11;	break;
			case 'L' : W += 12;	break;
			case 'M' : W += 13;	break;
			case 'N' : W += 14;	break;
			case 'O' : W += 15;	break;
			case 'P' : W += 16;	break;
			case 'Q' : W += 17;	break;
			case 'R' : W += 18;	break;
			case 'S' : W += 19;	break;
			case 'T' : W += 20;	break;
			case 'U' : W += 21;	break;
			case 'V' : W += 22;	break;
			case 'W' : W += 23;	break;
			case 'X' : W += 24;	break;
			case 'Y' : W += 25;	break;
			case 'Z' : W += 26;	break;
			}
		}
		
		return W;
	}
	
	public static void main(String[] args) {
		long Worth=0,Score=0,Tot =0;
		
		try
		{
			Scanner in = new Scanner(new File("D:\\SC-Workspace\\Test\\src\\ProjectEuler\\p022_names.txt"));

			while (in.hasNext()) 
			{ 
				String line = in.nextLine();
			    fields =line.split(","); 
			}
			in.close(); // don't forget to close resource leaks
			
			Arrays.sort(fields);
			int i =1;
			for (String text : fields) 
			{
				Worth= getWorth(text);
				Score = Worth * i++;
				Tot += Score;
			}
			System.out.println(" Final Tot= " + Tot);
		}
		catch (Exception e)
		{
			System.out.println("Exception : " + e.getMessage() );
		}
	}

}
