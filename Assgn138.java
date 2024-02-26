//write a testnNG code which has BS,AS,BM,BC,AC and one @test
package assgn_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assgn138 
{
	@BeforeSuite
	void BS()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	void AS()
	{
		System.out.println("After Suite");
	}
	@BeforeClass
	void BC()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("BeforeMethod");
	}
	@AfterClass
	void AC()
	{
		System.out.println("After Class");
	}
	
	@Test
	void abc()
	{
		System.out.println("Inside Test");
	}


}
