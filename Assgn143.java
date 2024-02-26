//create a class which has 2 @test with priority as 1,and find out which one executes first
package assgn_TestNG;

import org.testng.annotations.Test;

public class Assgn143 
{
	@Test(priority = 1)
	public void B()
	{
		System.out.println("In A Method");
	}
	
	@Test(priority = 1)
	public void A()
	{
		System.out.println("In B Method");
	}
}
