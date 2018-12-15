package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {

	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	ExtentReports extent;
    WebDriver driver ;
	

		
		@BeforeTest
		public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extent.html");

			extent = new ExtentReports();

			// attach only HtmlReporter
			extent.attachReporter(htmlReporter);
			String projectPath= System.getProperty("user.dir");
			//System.out.println("projectPath:" +projectPath );
			System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();

		}
		@Test
		public void test1() throws IOException{
			
			
			 
			
			ExtentTest test = extent.createTest("google search test one");
			test.log(Status.INFO, "test case start");
			 
			 driver.get("https://www.google.com");
			 
			 test.pass("go to google");
			 
			 driver.findElement(By.name("q")).sendKeys("atomation");
			 
			 test.pass("enter text n searchbox");

			
			test.log(Status.INFO, "This step shows write text in field");
			test.info("This step shows usage of info(details)");
			test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			test.addScreenCaptureFromPath("screenshot.png");
			
			
		}
		@Test
		public void test2() throws IOException{
			ExtentTest test = extent.createTest("google search test one");
 test.log(Status.INFO, "test case start");
			 
			 driver.get("https://www.google.com");
			 
			 test.pass("go to google");
			 
			 driver.findElement(By.name("q")).sendKeys("atomation");
			 
			 test.pass("enter text n searchbox");
			
			test.log(Status.INFO, "This step shows write text in field");
			test.info("This step shows usage of info(details)");
			test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			test.addScreenCaptureFromPath("screenshot.png");
			
			
		}



		@AfterTest
		public void tearDown(){
			driver.close();
			driver.quit();

			extent.flush();}
	}
