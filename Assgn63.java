package assignments;

import java.util.Scanner;

public class Assgn63 
{

	public static void main(String[] args) 
	{
		int Array[] = new int[5];
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value of 5 Integers");
		
		for(int i=0; i<5; i++)
		{
			Array[i] = s1.nextInt();
			
		}
		
		System.out.println("Value of 5 integers are");
		for(int k=0; k<5; k++)
		{
			System.out.println(Array[k]);
			
		}
		
	}

}
