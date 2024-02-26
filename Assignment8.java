//Create few constructor and call it in main method
package assignments;

public class Assignment8 
{
	Assignment8()
	{
		System.out.println("This is constructor");
	}
	Assignment8(int a)
	{
		System.out.println("This is Parameterized constructor1");
		System.out.println(a);
	}
	Assignment8(int b, int c)
	{
		System.out.println("This is Parameterized constructor2");
		int d= b+c;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Assignment8 a1 = new Assignment8();
		Assignment8 a2 = new Assignment8(10);
		Assignment8 a3 = new Assignment8(10,10);
		
	}

}
