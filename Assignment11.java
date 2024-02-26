/* WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, second method argument is double a,
 third method argument is char a, fourth method argument is boolean a and fifth method argument is String a */

package assignments;

public class Assignment11 
{
	static void method1(int a)
	{
		System.out.println(a);
	}
	static void method2(double a)
	{
		System.out.println(a);
	}
	static void method3(char a)
	{
		System.out.println(a);
	}
	void method4(boolean a)
	{
		System.out.println(a);
	}
	void method5(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		method1(10);
		method2(20);
		method3('a');
		Assignment11 a= new Assignment11();
		a.method4(true);
		a.method5("Amol");

	}

}
