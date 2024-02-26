package assignments;

import java.util.Scanner;

public class Assgn37 
{
	static int a;
	static int b;
	
	void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		System.out.println("Addition of a and b is:");
		int c = a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		System.out.println("Addition of a and b is:");
		int c = a-b;
		System.out.println(c);
	}
	void mul()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		System.out.println("Addition of a and b is:");
		int c = a*b;
		System.out.println(c);
	}
	void div()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		System.out.println("Addition of a and b is:");
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Assgn36 s1 = new Assgn36();
		s1.add();
		s1.mul();
		s1.sub();
		s1.div();

	}

}
