package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListners implements ITestListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("*********Test finish :"+context.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("*********Test onStart :"+context.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("*********Test onTestFailedButWithinSuccessPercentage :"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("*********Test onTestFailure :"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("*********Test onTestSkipped :"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("*********Test onTestStart :"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("*********Test onTestSuccess :"+result.getName());
		
	}

}
