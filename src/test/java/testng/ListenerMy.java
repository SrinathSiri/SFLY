package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerMy implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test Failure");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test Skipped");
    }
}
