package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(testng.ListenerMy.class)
public class ListenerTC1 {

    WebDriver driver = null;

    @Test(priority = 1)
    public void browserLaunch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://www3.shutterfly.com");
    }

    @Test(priority = 2,enabled = false)
    public void SflyURL(){
        System.out.println("Current Browser URL is : "+driver.getCurrentUrl());
    }

    @Test(priority = 3)
    public void SflyTitle(){
        System.out.println("Current browser title is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"title is");
    }

    @Test(priority = 4)
    public void browserClose(){
        driver.close();
    }
}
