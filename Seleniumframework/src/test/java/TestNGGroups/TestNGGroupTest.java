package TestNGGroups;

import org.testng.annotations.Test;
@Test(groups={"AllClassTest"})
public class TestNGGroupTest {
	
	@Test(groups={"sanity"})
	public void Test1(){
		System.out.println("This is test 1");
	}
	
	@Test(groups={"linux.regression"})
	public void Test2(){
		System.out.println("This is test 2");
	}
	@Test(groups={"windows.regression"})
	public void Test3(){
		System.out.println("This is test 3");
	}
	@Test
	public void Test4(){
		System.out.println("This is test  4");
	}

}
