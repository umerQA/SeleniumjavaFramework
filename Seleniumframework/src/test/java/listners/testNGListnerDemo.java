package listners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.testNGListners.class)
public class testNGListnerDemo {

	@Test
	public void test1()
	{
		System.out.println("I am in inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am in inside test2");
		//Assert.assertTrue(false);
		String projectPath= System.getProperty("user.dir");
		System.out.println("projectPath:" +projectPath );

		

		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com.pk/");
		
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
    
		
        driver.findElement(By.xpath("//input[@name='asd']")).sendKeys("facebook");
        driver.close();
	}
	@Test
	public void test3()
	{
		System.out.println("I am in inside test3");
		throw new SkipException("This test is skip");
	}

}
