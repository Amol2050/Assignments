//write a testNg program using dataprovider and perform the following activities launch google page search for five different cities  bangalore,pune,mumbai,chennai,hyderabad ,each time u search for cities get their title 

package assgn_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assgn151 
{
	@Test(dataProvider="data")
	public void city(String city)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys(city);
		Search.sendKeys(Keys.ENTER);
		driver.getTitle();
		driver.quit();
	}
	@DataProvider(name="data")
	public Object[][] method()
	{
		return new Object[][] {{"Pune"},{"Mumbai"},{"Delhi"},{"Banglore"},{"Chennai"}};
	}

}
