package Applitool;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolTest {

	
	public static void main(String[] args) {

	    //Use Chrome browser
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();

			// Initialize the eyes SDK and set your private API key.
			Eyes eyes = new Eyes();

			// Set the API key from the env variable. Please read the "Important Note"
			// section above.
			eyes.setApiKey("1ffrHLAZgkMHilfd6V5X102ioJ106FJvdj64TgDZEi4BVCw110");

			
				// Call getTestInfoForPart to get the appropriate test information.
				//HashMap<String, String> testInfo = App.getTestInfoForPart(args);

				// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
				eyes.open(driver, "HEllo World","my first selenium java test", new RectangleSize(600, 800));

				// Navigate the browser to the "ACME" demo app
				driver.get("https://applitools.com/Helloworld");

				
				eyes.checkWindow("HEllo !");

				driver.findElement(By.tagName("button")).click();
				eyes.checkWindow("Click !");

				// End the test.
				eyes.close();

			

				// Close the browser.
				driver.quit();

				// If the test was aborted before eyes.close was called, ends the test as
				// aborted.
				

				
			}

		}
	

