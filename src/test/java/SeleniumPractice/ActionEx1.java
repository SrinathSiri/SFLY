package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionEx1 {
    @Test
    public void doubleClick() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://api.jquery.com/dblclick/");
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        WebElement doubleclickele = driver.findElement(By.tagName("div"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleclickele).build().perform();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        WebElement frameele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameele);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action1 = new Actions(driver);
        action1.dragAndDrop(source,dest).build().perform();
        Thread.sleep(2000);
        driver.navigate().refresh();
        WebElement frameele1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameele1);
        WebElement source1 = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dest1 = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action2 = new Actions(driver);
        Thread.sleep(2000);
        action2.clickAndHold(source1).release(dest1).build().perform();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.cypress.io/");
        Thread.sleep(2000);
        WebElement mouseovele = driver.findElement(By.xpath("//a[@id='dropdownCommunity']"));
        Actions mouseovr = new Actions(driver);
        mouseovr.moveToElement(mouseovele).build().perform();
    }

}
