package assignments;

import java.util.Scanner;

public class Assgn153 
{

	public static void main(String[] args) 
	{
		int a[] = { 11,22,3453,231};
		Scanner s1 = new Scanner(System.in);
		int no = s1.nextInt();
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]== no)
			{
				System.out.println("Number is present at index value "+i+" :- " +a[i]);
			}
			

		}
		
	}

}
