package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TEst1_googleSearch_TestNG_Demo;

public class Propertiesfile {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();

	}
	public static void getProperties(){
		
		try {
		
			String projectPath=System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
		prop.load(input);
		String browser =prop.getProperty("browser");
		System.out.println(browser);
		TEst1_googleSearch_TestNG_Demo.browserName= prop.getProperty("browser");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
public static void setProperties(){
		
		try {
			
			String projectPath=System.getProperty("user.dir");
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		
		prop.setProperty("browser", "chrome");
		prop.store(output,null);
	
	//	System.out.println(browser);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

}}
