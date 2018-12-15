package TestNGRetry;

import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;



public class TestNGRetryDemo {
	
	
	@Test	
	public void test1()
	{
	System.out.println("Test1 first test");	
	}

	@Test	
	public void test2()
	{
	System.out.println("Test2 Second  test");	
	//int i=1/0; 	 	
	}
	@Test(retryAnalyzer = listners.RetryAnalyser.class)	
	public void test3()
	{
	System.out.println("Test3 Third test");	
	Assert.assertTrue(0>1);
	}

	
}
