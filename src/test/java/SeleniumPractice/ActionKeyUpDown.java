package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ActionKeyUpDown {
    @Test
    public void actionKeyUpDown() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame1);

        Actions action  = new Actions(driver);
        action.keyDown(Keys.CONTROL).perform();
        action.click(driver.findElement(By.xpath("//option[@value='volvo']")));
        Thread.sleep(2000);
        action.click(driver.findElement(By.xpath("//option[@value='audi']")));
        Thread.sleep(2000);
        action.keyUp(Keys.CONTROL).perform();

    }
}
