package assignments;

import java.util.Scanner;

public class Switch_assgn 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int a = s.nextInt();
		switch(a)
		{
		case 1: System.out.println("Case 1");
		break;
		case 2: System.out.println("Case 2");
		break;
		default: System.out.println("This is default case");
		}
	}

}
