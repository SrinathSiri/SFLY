package extentreport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Sfly3Title {

    public static WebDriver driver = null;

    @Test(priority = 1)
    public void browserLaunch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://www3.shutterfly.com");
    }

    @Test(priority = 2, enabled = false)
    public void SflyURL() {
        System.out.println("Current Browser URL is : " + driver.getCurrentUrl());
    }

    @Test(priority = 3)
    public void SflyTitle() {
        System.out.println("Current browser title is : " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "title is");
    }

    @Test(priority = 4)
    public void browserClose() {

        driver.close();
    }

    public String captureScreenshot(String tname) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        Date dt = new Date();
        String timestamp = df.format(dt);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilepath = System.getProperty("user.dir")+"\\screenshot\\"+tname+"_"+timestamp+".png";
        File dest = new File(targetFilepath);
        source.renameTo(dest);
        return targetFilepath;
    }
}
