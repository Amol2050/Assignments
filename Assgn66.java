package assignments;

import java.util.Scanner;

public class Assgn66 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		
		int Avg[] = new int[5];
		for(int i=0;i<size;i++)
		{
			Avg[i] = s1.nextInt();
		}
		System.out.println();
		int sum = 0;
		double Average = sum/(Avg.length);
		
	}

}
