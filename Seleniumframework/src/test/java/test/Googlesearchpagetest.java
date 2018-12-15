package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjectmodel.googleSearchPageObjects;

public class Googlesearchpagetest {
	
	private static WebDriver driver = null;
public static void main(String[] args) {
	
	googlesearchtest();
}
public static void googlesearchtest(){
	
	
	String projectPath= System.getProperty("user.dir");
	
	System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 googleSearchPageObjects searchpageobj = new googleSearchPageObjects(driver);
	 driver.get("https://www.google.com.pk/");
	 searchpageobj.setTextInSearchBox("facecbook");
	 searchpageobj.clickSearchButton();
	 driver.close();
	 
}

}
