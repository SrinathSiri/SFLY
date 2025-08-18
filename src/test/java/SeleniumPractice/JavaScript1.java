package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScript1 {
    @Test
    public void javaScript() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("location = 'https://www3.stage.shutterfly.com'");
        System.out.println(executor.executeScript("return document.title"));
        System.out.println(executor.executeScript("return document.URL"));
        executor.executeScript("history.back()");
        Thread.sleep(2000);
        executor.executeScript("history.forward()");
        Thread.sleep(2000);
        executor.executeScript("history.go(0)");
        Thread.sleep(2000);
        executor.executeScript("location = 'https://emicalculator.net/'");
        Thread.sleep(2000);
        executor.executeScript("document.getElementById('loaninterest').value=\"8.20\"");

    }
}
