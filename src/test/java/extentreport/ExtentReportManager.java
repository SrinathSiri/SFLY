package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;// UI of the report
    public ExtentReports extent; //populate common info on the report
    public ExtentTest test; // creating testcase entries in the report & update status of the test methods

    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); //specify location of the report

        sparkReporter.config().setDocumentTitle("Automation Report"); // Report Title
        sparkReporter.config().setReportName("Sanity Testing"); // Report Name
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name","localhost");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("TesterName","Pavan");
        extent.setSystemInfo("OS","Windows");
        extent.setSystemInfo("BrowserName","Chrome");
    }

    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName()); //create a new entry in the report
        test.log(Status.PASS,"Testcase passed is : " + result.getName());   //update status pass/fail/skipped
    }

    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.FAIL,"Testcase failed is : " +result.getName());
        test.log(Status.FAIL,"Testcase failed due to : "+result.getThrowable());
    }

    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.SKIP,"Testcase skipped is : "+result.getName());
    }

    public void onFinish(ITestContext context){
        extent.flush();
    }

}
