package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import Pageobjectmodel.googleSearchPage;

public class googleSearchTest {
private static WebDriver driver = null;
	public static void main(String[] args)  {
		
		 googleSearch();
	}
	public static void googleSearch() {
		
		String projectPath= System.getProperty("user.dir");
		//System.out.println("projectPath:" +projectPath );
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		/*
		 * First open google.com 
		 * then enter text in search field
		 * and then click on search button
		 */
		driver.get("https://www.google.com.pk/");
		//driver.findElement(By.name("q")).sendKeys("FAcecbook.com");
		googleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		googleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	//	driver.findElement(By.name("btnk")).click();
	//driver.findElement(By.name("btn.k")).sendKeys(Keys.RETURN);
		
        

        

		
		
		//Thread.sleep(5000);
		//driver.close();
		System.out.println("Test complete successfully");
		
	}

}
