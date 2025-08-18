package SeleniumPractice;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Screenshot2 {
    @Test
    public void screenshot(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://datatables.net/");
        Shutterbug.shootPage(driver, Capture.FULL).save("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\SFLY\\screenshot\\image2.png");
    }

}
