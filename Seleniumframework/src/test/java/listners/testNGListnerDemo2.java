package listners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.testNGListners.class)
public class testNGListnerDemo2 {

	@Test
	public void test4()
	{
		System.out.println("I am in inside test4");
	}
	@Test
	public void test5()
	{
		System.out.println("I am in inside test5");
		//Assert.assertTrue(false);
	}
	@Test
	public void test6()
	{
		System.out.println("I am in inside test6");
		throw new SkipException("This test is skip");
	}

}
