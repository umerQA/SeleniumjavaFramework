package TestNGDependency;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups={"Sanity.*"})
	public void Test1(){
		System.out.println("This is test 1");
	}
	
	@Test (groups={"Sanity"})
	public void Test2(){
		System.out.println("This is test 2");
	}
	@Test(groups={"Sanity"})
	public void Test3(){
		System.out.println("This is test 3");
	}
	//@Test
	//public void Test4(){
		//System.out.println("This is test  4");
	//}


}
