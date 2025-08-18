package org.sfly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertClass {
    @Test
    public void alertMethod(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        driver.get("https://www.leafground.com/");
        driver.findElement(By.className("pi pi-globe layout-menuitem-icon")).click();
        driver.findElement(By.xpath("//span[text()='Alert']")).click();
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
        Alert alert = driver.switchTo().alert();
        String alerttextinfo = alert.getText();
        System.out.println(alerttextinfo);
        alert.accept();

    }
}
