package TestNGMultiBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowsertest {
	
	WebDriver driver = null;
	String projectPath= System.getProperty("user.dir");
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName)
	{
	System.out.println("Broeser name is :"+BrowserName);
	if (BrowserName.equalsIgnoreCase("chrome")){
		
		//
		
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 }
	else if
(BrowserName.equalsIgnoreCase("firefox")){
		
		//
		
		System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers/Geckodriver/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
	}
	}
@Test
	public void test1() throws InterruptedException
	{
	driver.get("https://www.google.com.pk/");
	Thread.sleep(4000);
	
   // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
	//System.out.println("I am inside test 1 : ");
		
	}
@AfterTest
public void teardown()
{
driver.close();	
	System.out.println("Test Complete ! ");
	}



}
