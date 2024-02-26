package assignments;

import java.util.Scanner;

public class Assgn38 
{
	Assgn38()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		System.out.println("Enter the value of h");
		int h = s.nextInt();
		double area = 0.5*(b*h);
		System.out.println("Aread of Triangle is:"+ area);
		
	}
	public static void main(String[] args) 
	{
		new Assgn38();
	}

}
