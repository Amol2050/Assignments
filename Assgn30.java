//WAP to  calculate the area of circle.(pi value should be final static local variable and initialise). 
package assignments;

public class Assgn30 
{
	final static double  pi = 3.14;
	static void area()
	{
		int r =4;
		double area = pi*r*r;
		System.out.println(area);
		
	}
	
	public static void main(String[] args) 
	{
		area();
		int r =5;
		double area = pi*r*r;
		System.out.println(area);
		
	}

}
