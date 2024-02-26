//	Write many non static method and call it inside the main method

package assignments;

public class Assignment6 
{
	void method1()
	{
		System.out.println("This is non static method1");
	}
	void method2()
	{
		System.out.println("This is non static method2");
	}
	void method3()
	{
		System.out.println("This is non static method3");
	}
	public static void main(String[] args) 
	{
		Assignment6 a = new Assignment6();
		a.method1();
		a.method2();
		a.method3();
		
		
	}

}
