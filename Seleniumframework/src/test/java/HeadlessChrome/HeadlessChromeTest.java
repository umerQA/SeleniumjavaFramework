package HeadlessChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {
	
public static void main(String[] args) {
	test();
}
	public static void test() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("windows-size=1280,800");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("go")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		

	}

}
