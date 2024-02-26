//WAP to find the Area of Circle , keep pi as static global final , create 2 methods 1 having r = 7 and another having r =14
package assignments;

public class Assgn33 {
	final static double  pi = 3.14;
	static void area()
	{
		int r =4;
		double area = pi*r*r;
		System.out.println(area);
		
	}
	static void area1()
	{
		int r =7;
		double area = pi*r*r;
		System.out.println(area);
		
	}
	

	public static void main(String[] args) 
	{

				area();
				area1();
				//double area = pi*r*r;
				//System.out.println(area);
				
			}

		}

	
