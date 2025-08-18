package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUpload2 {
    @Test
    public void fileUpload2() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
        driver.switchTo().frame("iframeResult");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\v-srinath.sirimalla\\Downloads\\RO_Check.pdf");

        // As we are getting Invalid Argument exception as after click we are getting window application open. to overcome this we need to use either actions class click or js click
        //driver.findElement(By.xpath("//input[@id='myFile']")).click();

        WebElement typicalclick = driver.findElement(By.xpath("//input[@id='myFile']"));
        // Actions class click
        /*Actions action  = new Actions(driver);
        action.click(typicalclick);*/

        // JS click
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('myFile').click()");

    }
}
