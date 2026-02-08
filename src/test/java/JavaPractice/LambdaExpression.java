package JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LambdaExpression {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shutterfly.com");

        Wait<WebDriver> wait = new FluentWait(driver)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMinutes(1))
                .ignoring(NoSuchElementException.class);
        wait.until(WebDriver -> {
            return driver.getTitle().equalsIgnoreCase("");
        });

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));


    }
}
