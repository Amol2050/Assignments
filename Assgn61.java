package assignments;

public class Assgn61 
{

	public static void main(String[] args) 
	{
		try
		{
			int c = 1/0;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Inside AE catch");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Inside NP Exception	");
		}
		finally
		{
			System.out.println("I am in Finally");
		}
	}

}
