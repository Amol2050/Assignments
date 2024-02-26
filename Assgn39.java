package assignments;

import java.util.Scanner;

public class Assgn39 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		if(age>=18)
		{
			System.out.println("Your are elligible for voting");
			
		}
		else
		{
			System.out.println("You are not elligible for voting");
		}
		
	}

}
