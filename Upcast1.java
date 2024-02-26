package assignments;
class A1
{
	void a1()
	{
		System.out.println("A");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("B");
	}
	
}
class C extends B1
{
	void c1()
	{
		System.out.println("C");
	}
}
public class Upcast1 extends C
{

	public static void main(String[] args) 
	{
		B1 b1 = new C();
		b1.a1();
		b1.b1();
	}

}
