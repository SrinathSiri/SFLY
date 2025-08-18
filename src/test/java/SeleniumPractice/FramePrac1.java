package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramePrac1 {
    @Test
    public void framePrac1() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.leafground.com/frame.xhtml");
        WebElement firstframe = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
        //driver switch to frame using WebElement
        driver.switchTo().frame(firstframe);
        driver.findElement(By.xpath("//button[@id='Click'][text()='Click Me']")).click();
        //control back to parent frame
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement secframe = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
        driver.switchTo().frame(secframe);
        driver.findElement(By.xpath("//button[@id='Click'][text()='Count Frames']")).click();
        driver.switchTo().defaultContent();
        WebElement thirdframe = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
        driver.switchTo().frame(thirdframe);
        //Internal frame
        WebElement nestedframe = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(nestedframe);
        driver.findElement(By.xpath("//button[@id='Click'][text()='Click Me']")).click();
        //moving to main frame
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();


    }
}
