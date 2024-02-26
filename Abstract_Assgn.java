package assignments;

class Abc
{
	static void add()
	{
		System.out.println("Addition Method");
	}
	void sub()
	{
		System.out.println("Substract method");
	}
	
}

abstract class Pqr extends Abc
{
	abstract void mul();
	abstract void div();
}
public class Abstract_Assgn extends Pqr
{
	static void method1()
	{
		System.out.println("Inside method1");
	}
	void method2()
	{
		System.out.println("Inside method2");
	}
	public static void main(String[] args) 
	{
		Abstract_Assgn a = new Abstract_Assgn();
		method1();
		a.method2();
		add();
		a.sub();
		a.mul();
		a.div();

	}
	
	void mul() 
	{
		System.out.println("Multiplication method");
	}
	void div()
	{
		System.out.println("Division method");
	}

}
