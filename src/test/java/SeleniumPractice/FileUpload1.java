package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUpload1 {
    @Test
    public void fileUpload1() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
        driver.switchTo().frame("iframeResult");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\v-srinath.sirimalla\\Downloads\\RO_Check.pdf");
        //driver.findElement(By.xpath("//input[@id='myFile']")).click();
    }
}
