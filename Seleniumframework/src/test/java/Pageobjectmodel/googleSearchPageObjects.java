package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {
	
	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnk");
	
	public googleSearchPageObjects(WebDriver driver){
		
		this.driver=driver;
		
		
	}
	
	public void setTextInSearchBox(String text){
		driver.findElement( textbox_search).sendKeys(text);
		
		
	}
	 public void clickSearchButton(){
		 driver.findElement(button_search).sendKeys(Keys.RETURN);
	 }

}
