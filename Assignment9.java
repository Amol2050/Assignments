//WAP to perform Subtraction, Multiplication and Division of 2 numbers.
package assignments;

public class Assignment9 
{
	int a = 20;
	int b=30;
	void subtract()
	{
		int c = a-b;
		System.out.println("Substarction is"+c);
	}
	void multiply()
	{
		int d = a*b;
		System.out.println("Multiplication is"+d);
	}
	void divide()
	{
		int e = a/b;
		System.out.println("Division is"+e);
	}

	public static void main(String[] args) 
	{
		Assignment9 a = new Assignment9();
		a.subtract();
		a.multiply();
		a.divide();
	}

}
