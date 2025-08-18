package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait2 {
    @Test
    public void wait2() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://github.com/login");
        driver.findElement(By.linkText("Create an account")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srinathhero18@yopmail.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
        driver.findElement(By.id("searchBtn")).click();
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofMinutes(5));
        wait1.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
