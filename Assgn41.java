package assignments;

import java.util.Scanner;

public class Assgn41 
{
	static int b;
	static int c;
	static int d;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int a = s.nextInt();
		switch(a)
		{
		case 1: 
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of b");
			b = s1.nextInt();
			System.out.println("Enter the value of c");
			c = s1.nextInt();
			d= b+c;
			System.out.println("Addition is"+ d);
		break;
		case 2: 
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the value of b");
			 b = s2.nextInt();
			System.out.println("Enter the value of c");
			 c = s2.nextInt();
			 d= b-c;
			System.out.println("Substraction is"+ d);
		break;
		case 3: 
			Scanner s3 = new Scanner(System.in);
			System.out.println("Enter the value of b");
			 b = s3.nextInt();
			System.out.println("Enter the value of c");
			 c = s3.nextInt();
			 d= b*c;
			System.out.println("Multiplication is"+ d);
			break;
		case 4: 
			Scanner s4 = new Scanner(System.in);
			System.out.println("Enter the value of b");
			 b = s4.nextInt();
			System.out.println("Enter the value of c");
			 c = s4.nextInt();
			 d= b/c;
			System.out.println("Division is"+ d);
			break;
		default: System.out.println("This is default case");

	}

}
}
