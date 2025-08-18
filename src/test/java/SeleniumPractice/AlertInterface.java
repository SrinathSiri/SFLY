package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertInterface {
    @Test
    public void alertPractice() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.leafground.com/");
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
        driver.findElement(By.xpath("//span[text()='Alert']")).click();
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'][text()='Show'])[1]")).click();
        Thread.sleep(5000);
        // moving driver control on alert
        Alert alert = driver.switchTo().alert();
        String alertmsg = alert.getText();
        System.out.println(alertmsg);

        //confirmation that alert msg is correct or not
        if (alertmsg.equalsIgnoreCase("I am simple alert.")) {
            System.out.println("Alert message is correctly validated");
        } else {
            System.out.println("Alert message is wrongly Validated");
        }
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("AON Hewitt");
        Thread.sleep(5000);
        alert2.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.dismiss();
    }
}
