package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDown {
    @Test
    public void dropDownSelect() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.leafground.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("menuform:m_dropdown")).click();
        Thread.sleep(2000);
        //dropdown webelement
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Cypress");
        Thread.sleep(2000);
        select.selectByValue("Puppeteer");


    }


}
