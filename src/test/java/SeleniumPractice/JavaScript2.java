package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScript2 {
    @Test
    public void javaScript2() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("location = 'https://emicalculator.net/'");
        //click element using javascript method
        executor.executeScript("document.getElementById('loanmonths').click()");
        Thread.sleep(2000);
        //highligh with color
        executor.executeScript("document.getElementById('loanterm').style.border='5px solid blue'");
        Thread.sleep(2000);
        //highligh background
        executor.executeScript("document.getElementById('loaninterest').style.background='pink'");
        Thread.sleep(2000);
        //scroll to highlight webelement
        executor.executeScript("document.getElementById('internal-source-marker_0.6092460654906617').scrollIntoView()");


    }
}
