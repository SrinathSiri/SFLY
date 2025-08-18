package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.time.Duration;

public class AssertEx1 {
    @Test
    public void m1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        Assert.assertNull(driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        Assert.assertNotNull(driver);
        Assert.assertEquals(1,1);
        Assert.assertNotEquals(1,2);

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        WebElement frameele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frameele);
        WebElement selectdp = driver.findElement(By.xpath("//Select[@id='cars']"));
        Select select = new Select(selectdp);
        select.selectByValue("saab");
        Assert.assertTrue(select.isMultiple());
        System.out.println("Hello All!");
    }
}
