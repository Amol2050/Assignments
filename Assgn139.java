//write a testNG code which has BM,AM,two  @test
package assgn_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn139 
{
	@Test
	void Test1()
	{
		System.out.println("Inside Test1");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("Before Method");
	}
	@Test
	void Test2()
	{
		System.out.println("Inside Test2");
	}
	
	@AfterMethod
	void AM()
	{
		System.out.println("After Method");
	}

}
