package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigateBrowser {
    @Test
    public void navigateBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://wwww.shutterfly.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://www.carwale.com/");
        Thread.sleep(2000);
        String secbrowtitle = driver.getTitle();
        System.out.println("Second Browser title is : " + secbrowtitle);
        String secbwurl = driver.getCurrentUrl();
        if (secbwurl.equalsIgnoreCase("https://www.carwale.com/")) {
            System.out.println("Second Browser URL matched");
            System.out.println("Second Broswer URL is: "+secbwurl);
        } else {
            System.out.println("Second Browser URL not matched");
        }

    }
}
