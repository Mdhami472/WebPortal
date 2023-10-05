package ui;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyTitleTest 
{
	@Test
public void tilteTest()
{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	  //System.setProperty("webdriver.chrome", "C:\\BrowserDriver.exe");
	
		//String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	
	   // String ActualTitle = driver.getTitle();
	    //System.out.println("Title "+ActualTitle);
	
	   // Assert.assertEquals(ActualTitle, expectedTitle);
 

}
	
    

}
