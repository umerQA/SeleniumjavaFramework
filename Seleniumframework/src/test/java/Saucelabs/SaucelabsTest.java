package Saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsTest {


 
  public static final String USERNAME = "umerQA";
  public static final String ACCESS_KEY = "9793dfc1-bc94-46df-9e44-01e0dbc731f9";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
   // caps.setCapability("platform", "Windows 10");
    caps.setCapability("platform", "Linux");
    caps.setCapability("version", "latest");
    caps.setCapability("name", "bing test 1");
    caps.setCapability("extended debugging", "true");
    caps.setCapability("buildNumber", "3.0	");
 
    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//    String projectPath= System.getProperty("user.dir");
//    System.setProperty("webdriver.chrome.driver",  projectPath+"//Drivers/Chromedriver/chromedriver.exe");
//	
//    WebDriver driver = new ChromeDriver();
    
 
    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */
 
    driver.get("https://www.bing.com/");
    System.out.println(driver.getTitle());
    driver.findElement(By.name("q")).sendKeys("facebook");
    driver.findElement(By.name("go")).sendKeys(Keys.RETURN);
 
    driver.quit();
    System.out.println("Test Completed");
  }
}


