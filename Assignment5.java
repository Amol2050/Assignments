//Write a non static method and call it inside the main method
package assignments;

public class Assignment5 
{
	void print()
	{
		System.out.println("This is non static method");
	}
	public static void main(String[] args) 
	{
		Assignment5 a1 = new Assignment5();
		a1.print();
	}

}
