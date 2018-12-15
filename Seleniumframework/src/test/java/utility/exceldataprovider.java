package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.Propertiesfile;

public class exceldataprovider {
	 WebDriver driver =null;

	@BeforeTest
	public void SetUpTest(){

		String projectPath= System.getProperty("user.dir");


		System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers/Geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();



		//		Logger.info("Browser started")	;

	}


@Test(dataProvider="test1data")
public void test1(String username, String password) throws Exception
{
	System.out.println(username+" | "+password);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	
}
@DataProvider (name="test1data")
public Object[][]  getData(){
	String excelPath ="D:/worskspace/Seleniumframework/excel/data.xlsx";
	Object data[][]=testdata(excelPath, "Sheet1");
	return data;

}
public  Object[][]  testdata(String excelPath , String sheetName){

	try {
		Excelutil excel = new Excelutil(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();

		Object data[][] = new  Object[rowCount-1][colCount];

		for (int i=1;i<rowCount;i++){
			for (int j=0; j<colCount;j++){

				String celldata=excel.getCellDataString(i, j);
				System.out.print(celldata +"|");
				data[i-1][j]=celldata;
			}

		}
		return data;

	} catch (IOException e) {

		e.printStackTrace();
	}
	return null;
}

}
