package assgn_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assgn137
{
	@BeforeSuite
	void BS()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	void BT()
	{
		System.out.println("BeforeTest");
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
	@Test
	void abc()
	{
		System.out.println("Inside Test");
	}


}
