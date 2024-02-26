//write a testNG code which has three @test and a single BM 

package assgn_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn140 
{
	@Test
	void Test1()
	{
		System.out.println("Inside Test 1");
	}
	@Test
	void Test2()
	{
		System.out.println("Inside Test 2");
	}
	@Test
	void Test3()
	{
		System.out.println("Inside Test 3");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("Before Method");
	}


}
