package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDrop {
    @Test
    public void selectDrop() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www3.shutterfly.com/t/travel-mugs/");
        driver.findElement(By.xpath("//button[@id='logicalProductType']")).click();
        Thread.sleep(4000);
        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='filter-list max-h-[480px] overflow-y-auto p-[8px] pt-1.5'])[4]/li/a"));
        for(WebElement ecele:list){
           System.out.println(ecele.getText());
        }
    }
}
