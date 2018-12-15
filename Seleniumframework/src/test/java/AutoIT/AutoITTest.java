package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoITTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	
	
public static void test() throws IOException, InterruptedException {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms
		driver.get("http://www.tinyupload.com/");
		
		driver.findElement(By.name("uploaded_file")).click();
	Runtime.getRuntime().exec("E:/fileuploadscript.exe");
	
	Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		

	}

	

}
