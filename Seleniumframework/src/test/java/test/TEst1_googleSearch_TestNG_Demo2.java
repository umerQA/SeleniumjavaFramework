package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEst1_googleSearch_TestNG_Demo2 {

	WebDriver driver =null;
	@BeforeTest
	public void SetUpTest(){

		String projectPath= System.getProperty("user.dir");
		//System.out.println("projectPath:" +projectPath );
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();



	}
	@Test
	public  void googleSearch2() {


		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("FAcecbook.com");
		//	driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	}
     
	@Test
	public  void googleSearch3() {


		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("FAcecbook.com");
		//	driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        //Thread.sleep(5000);


	}
	@AfterTest
	public void teardowntest(){
		driver.close();
		System.out.println("Test complete successfully");

	}
}
