package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait1 {
    @Test
    public void explicitWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://portal.microfocus.com/s/?language=en_US");
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='username']")));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinathstage6@yopmail.com");
    }
}
