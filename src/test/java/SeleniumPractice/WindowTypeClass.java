package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WindowTypeClass {
    @Test
    public void windowTypeMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        driver.get("https://www.shutterfly.com");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://chatgpt.com/");
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");
        driver.quit();

    }
}
