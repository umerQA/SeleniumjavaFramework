package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		seleniumwaits();
		
	}
	
	public static void seleniumwaits() throws InterruptedException
	{
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250  ms
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("go")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("cdef")));
		
		driver.findElement(By.name("abcd")).click();
		Thread.sleep(6000);
		driver.close();
		driver.quit();
	}

}
