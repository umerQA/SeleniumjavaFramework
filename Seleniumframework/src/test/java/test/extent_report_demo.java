package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extent_report_demo {
private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
		// creating tests
		ExtentTest test = extent.createTest("google search test one");
		String projectPath= System.getProperty("user.dir");
		//System.out.println("projectPath:" +projectPath );
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 test.log(Status.INFO, "test case start");
		 
		 driver.get("https://www.google.com");
		 
		 test.pass("go to google");
		 
		 driver.findElement(By.name("q")).sendKeys("atomation");
		 
		 test.pass("enter text n searchbox");
		 
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 
		 //test.pass("enter searchbox button");
		 driver.close();
		 driver.quit();
		test.pass("browser close");
		 test.info("test completed");
		 extent.flush();
	}

}
