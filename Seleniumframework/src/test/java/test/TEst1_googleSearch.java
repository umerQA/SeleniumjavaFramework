package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TEst1_googleSearch {

	public static void main(String[] args)  {
		
		 googleSearch();
	}
	public static void googleSearch() {
		
		String projectPath= System.getProperty("user.dir");
		//System.out.println("projectPath:" +projectPath );
		System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers/Geckodriver/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		/*
		 * First open google.com 
		 * then enter text in search field
		 * and then click on search button
		 */
		driver.get("https://www.google.com.pk/");
		driver.findElement(By.name("q")).sendKeys("FAcecbook.com");
	//	driver.findElement(By.name("btnk")).click();
	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
        

        

		
		
		//Thread.sleep(5000);
		//driver.close();
		System.out.println("Test complete successfully");
		
	}

}
