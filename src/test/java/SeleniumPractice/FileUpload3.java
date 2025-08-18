package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUpload3 {
    @Test
    public void fileUpload3() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
        WebElement iframeele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframeele);
        Thread.sleep(3000);
        WebElement chosefile = driver.findElement(By.xpath("//input[@id='myFile']"));
        Actions action  = new Actions(driver);
        action.click(chosefile).build().perform();
        Thread.sleep(5000);

        Robot robot = new Robot();

        StringSelection ss = new StringSelection("C:\\Users\\v-srinath.sirimalla\\Downloads\\RO_Check.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}