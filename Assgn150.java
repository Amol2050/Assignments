//write a testng code to fetch double datatype values from a method using dataprovider annotation
package assgn_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assgn150 
{
	@Test(dataProvider=("data"))
	public void method(double number)
	{
		System.out.println(number);
	}
	
	@DataProvider(name="data")
	public Object[][] method1()
	{
		return new Object[][] {{10.20},{20.30},{30.40}};
				
	}


}
