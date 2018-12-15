package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentwaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static void test() throws InterruptedException {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250  ms
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("go")).sendKeys(Keys.RETURN);
		driver.findElement(By.linkText("Learn Step-by-Step How")).click();
		
		
		   
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   @SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		      .withTimeout(30, TimeUnit.SECONDS) 
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement linkElement= driver.findElement(By.linkText("Learn Step-by-Step How"));
			     if(linkElement.isEnabled()){
			    	 
			    	 System.out.println();
			     }
			     return linkElement;
		     }
		   });
		 
	element.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		

	}

}
