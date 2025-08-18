package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramePrac {
    @Test
    public void framePractice() throws Exception{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.leafground.com/");
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Frame']")).click();
        Thread.sleep(2000);
        //driver switching to first frame
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='Click']")).click();

    }

}
