package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {

	
private	static Logger  logger= LogManager.getLogger(log4j.class);
	public static void main(String[] args) {
		
		
		System.out.println(" \n Heloo World...!  \n");
		logger.trace("This is trace msg");
		logger.info("This is info msg");
		logger.error("This is error msg");
		logger.warn("This is warn msg");
		logger.fatal("This is fatal msg");
		
		System.out.println("\n completed . ");
		

	}

}
