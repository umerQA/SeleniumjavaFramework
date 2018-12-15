package TestNGIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore 
public class TestNGIgnoreDemo {
	
	
@Test	
public void test1()
{
System.out.println("Test1 first test");	
}

@Test	
public void test2()
{
System.out.println("Test2 Second  test");	
}
}
