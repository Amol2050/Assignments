//create a class add 4 @test in one @test add invocationCount=11 find out number of test cases executed add AM and BM to it
package assgn_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn142 
{
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test(invocationCount = 11)
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}
	@Test
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("AfterMethod");
	}

}
