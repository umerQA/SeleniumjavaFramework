import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsertest {
	public static void main(String[] args) throws InterruptedException {

		String projectPath= System.getProperty("user.dir");
		System.out.println("projectPath:" +projectPath );

		System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers/Geckodriver/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();

		//	System.setProperty("webdriver.ie.driver", projectPath+"//Drivers/Iedriver/IEDriverServer.exe");
		//	WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com.pk/");
		
         driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
         
         List<WebElement> listOfInputElements=  driver.findElements(By.xpath("//input"));
       int count=  listOfInputElements.size();
       System.out.println("Count of input elemrnt :"+count);
         Thread.sleep(4000);
		driver.close();
	}}