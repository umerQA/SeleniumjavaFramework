package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desirecapabilitydemo {
	public static void main(String[] args) {
		
		
		
		String projectPath= System.getProperty("user.dir");
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath+"//Drivers/Iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://www.google.com.pk/");
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
		  driver.close();
		
		
	}


	

	}


