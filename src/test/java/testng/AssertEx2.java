package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AssertEx2 {
    @Test
    public void m1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        SoftAssert obj = new SoftAssert();
        obj.assertNull(driver);
        System.out.println("Driver is null - true");
        obj.assertNotNull(driver);
        System.out.println("Driver is null - true");
        obj.assertAll();

    }
}
